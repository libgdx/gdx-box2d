import com.badlogic.gdx.jnigen.commons.Architecture
import com.badlogic.gdx.jnigen.commons.Os
import com.badlogic.gdx.jnigen.gradle.JnigenExtension.*
import kotlin.io.path.createTempDirectory

plugins {
    id("java")
    id("com.badlogicgames.jnigen.jnigen-gradle") version "3.0.0-SNAPSHOT"
}

group = property("group") as String
version = property("version") as String

val jnigenVersion = property("jnigen.version") as String

repositories {
    mavenCentral()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
        mavenContent {
            snapshotsOnly()
        }
    }
}

dependencies {
    implementation("com.badlogicgames.jnigen:jnigen-loader:${jnigenVersion}")
    implementation("com.badlogicgames.jnigen:jnigen-runtime:${jnigenVersion}")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-desktop")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-ios")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-arm64-v8a")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-armeabi-v7a")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-x86")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-x86_64")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

fun cmakeBuild(installDir: File, taskName: String, toolchainFile: File, extraFlags: Array<String> = emptyArray(), buildFlags: Array<String> = emptyArray(), installFlags: Array<String> = emptyArray()): Task {
    return tasks.create("build_box2d_${taskName}") {
        group = "box2d"
        doLast {
            val tmpDir = createTempDirectory("build_box2d_${taskName}").resolve("box2d").toFile()
            tmpDir.mkdirs()
            installDir.mkdirs()
            exec {
                commandLine = listOf("cmake")
                args = listOf("-B", tmpDir.absolutePath, "-S", file("box2d").absolutePath,
                    "-DBOX2D_SAMPLES=OFF",
                    "-DBOX2D_VALIDATE=OFF",
                    "-DBOX2D_UNIT_TESTS=OFF",
                    "-DCMAKE_C_FLAGS_INIT=-fexceptions",
                    "-DCMAKE_STAGING_PREFIX=${installDir.absolutePath}",
                    "-DCMAKE_INSTALL_LIBDIR=${installDir.toPath().resolve("libs")}",
                    "-DCMAKE_TOOLCHAIN_FILE=${toolchainFile.absolutePath}",
                    *extraFlags)
            }

            exec {
                commandLine = listOf("cmake")
                args = listOf("--build", tmpDir.absolutePath, "--config", "Release", *buildFlags)
            }

            exec {
                commandLine = listOf("cmake")
                args = listOf("--install", tmpDir.absolutePath, *installFlags)
            }
        }
    }
}

tasks.create("build_macos") {
    group = "box2d"
    dependsOn(cmakeBuild(file("build/box2d/macosx_arm64"), "macosx_arm64", file("box2d_build/toolchain_macos.cmake"),
        arrayOf("-DCMAKE_OSX_ARCHITECTURES=arm64", "-DCMAKE_SYSTEM_PROCESSOR=aarch64")))
    dependsOn(cmakeBuild(file("build/box2d/macosx_x86_64"), "macosx_x86_64", file("box2d_build/toolchain_macos.cmake"),
        arrayOf("-DCMAKE_OSX_ARCHITECTURES=x86_64", "-DCMAKE_SYSTEM_PROCESSOR=x86_64")))
}

tasks.create("build_android") {
    group = "box2d"
    for (abi in  arrayOf("x86", "x86_64", "armeabi-v7a", "arm64-v8a")) {
        dependsOn(cmakeBuild(file("build/box2d/android/${abi}"), "android_${abi}", file("${System.getenv("NDK_HOME")}/build/cmake/android.toolchain.cmake"),
            arrayOf("-DANDROID_ABI=${abi}", "-DANDROID_PLATFORM=android-21", "-DANDROID_STL=c++_shared")))
    }
}

tasks.create("build_linux") {
    group = "box2d"
    dependsOn(cmakeBuild(file("build/box2d/linux_arm"), "linux_arm", file("box2d_build/toolchain_linux_arm32.cmake")))
    dependsOn(cmakeBuild(file("build/box2d/linux_arm64"), "linux_arm64", file("box2d_build/toolchain_linux_arm64.cmake")))
    dependsOn(cmakeBuild(file("build/box2d/linux_riscv64"), "linux_riscv64", file("box2d_build/toolchain_linux_riscv64.cmake")))
    dependsOn(cmakeBuild(file("build/box2d/linux_x86_64"), "linux_x86_64", file("box2d_build/toolchain_linux_x86_64.cmake")))
}

tasks.create("build_ios") {
    group = "box2d"
    dependsOn(cmakeBuild(file("build/box2d/ios_iphoneos_arm64"), "ios_iphoneos_arm64", file("box2d_build/toolchain_ios.cmake"),
        arrayOf("-GXcode", "-DCMAKE_OSX_SYSROOT=iphoneos"), arrayOf("--target", "box2d", "--", "-sdk", "iphoneos", "-arch", "arm64")))
    dependsOn(cmakeBuild(file("build/box2d/ios_iphonesimulator_arm64"), "ios_iphonesimulator_arm64", file("box2d_build/toolchain_ios.cmake"),
        arrayOf("-GXcode", "-DCMAKE_OSX_SYSROOT=iphonesimulator"), arrayOf("--target", "box2d", "--", "-sdk", "iphonesimulator", "-arch", "arm64")))
    dependsOn(cmakeBuild(file("build/box2d/ios_iphonesimulator_x86_64"), "ios_iphonesimulator_x86_64", file("box2d_build/toolchain_ios.cmake"),
        arrayOf("-GXcode", "-DCMAKE_OSX_SYSROOT=iphonesimulator"), arrayOf("--target", "box2d", "--", "-sdk", "iphonesimulator", "-arch", "x86_64")))
}

jnigen {
    javaClass.superclass.getDeclaredField("sharedLibName").apply { isAccessible = true }.set(this, "gdx-box2d")
    generator {
        outputPath = file("src/main/java")
        basePackage = "com.badlogic.box2d"
        fileToParse = "box2d/box2d.h"
        options = arrayOf("-I" + file("box2d/include", ).absolutePath, "-DNDEBUG")
    }

    all {
        var name = os.name.lowercase()
        if (os == Os.IOS)
            name = "ios_" + targetType.platformName

        val arch = architecture.name.lowercase() + (if(architecture == Architecture.x86 && bitness != Architecture.Bitness._32) "_" else "") + bitness.toSuffix()
        val combined = name + "_" + arch

        headerDirs += arrayOf("build/box2d/${combined}/include/")
        cFlags += " -std=c11 -fexceptions "
        cppFlags += " -std=c++11 -fexceptions "
        libraries += file("build/box2d/${combined}/libs/libbox2d.a").absolutePath
    }

    addLinux(x32, ARM)
    addLinux(x64, x86)
    addLinux(x64, ARM)
    addLinux(x64, RISCV)

    addMac(x64, ARM)
    addMac(x64, x86)
    addAndroid {
        libraries = ""
        androidApplicationMk += "APP_PLATFORM := android-21\nAPP_STRIP_MODE := none\nAPP_STL := c++_shared"
        linkerFlags += " -stdlib=libc++\nLOCAL_WHOLE_STATIC_LIBRARIES := static_box2d"
        androidAndroidMk += arrayOf(
            "include \$(CLEAR_VARS)",
            "LOCAL_MODULE := static_box2d",
            "LOCAL_SRC_FILES := \$(realpath ${file("build/box2d/android").absoluteFile}/\$(TARGET_ARCH_ABI)/libs/libbox2d.a)",
            "LOCAL_EXPORT_C_INCLUDES := \$(realpath ${file("build/box2d/android/\$(TARGET_ARCH_ABI)/include/").absoluteFile})",
            "include \$(PREBUILT_STATIC_LIBRARY)")
    }
    addIOS()
}