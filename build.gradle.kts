import com.badlogic.gdx.jnigen.commons.Architecture
import com.badlogic.gdx.jnigen.commons.Os
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

fun cmakeBuild(installDir: File, taskName: String, toolchainFile: File, extraFlags: Array<String> = emptyArray<String>()): Task {
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
                    "-DCMAKE_TOOLCHAIN_FILE=${toolchainFile.absolutePath}",
                    *extraFlags)
            }

            exec {
                commandLine = listOf("cmake")
                args = listOf("--build", tmpDir.absolutePath)
            }

            exec {
                commandLine = listOf("cmake")
                args = listOf("--install", tmpDir.absolutePath)
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

jnigen {
    javaClass.superclass.getDeclaredField("sharedLibName").apply { isAccessible = true }.set(this, "gdx-box2d")
    generator {
        outputPath = file("src/main/java")
        basePackage = "com.badlogic.box2d"
        fileToParse = "box2d/box2d.h"
        options = arrayOf("-I" + file("box2d/include").absolutePath)
    }

    all {
        var name = os.name.lowercase()
        if (os == Os.IOS)
            name = targetType.platformName

        val arch = architecture.name.lowercase() + (if(architecture == Architecture.x86 && bitness != Architecture.Bitness._32) "_" else "") + bitness.toSuffix()
        val combined = name + "_" + arch

        headerDirs += arrayOf("box2d/include/")
        cFlags += " -std=c11 -fexceptions "
        cppFlags += " -std=c++11 -fexceptions "
        libraries += file("build/box2d/${combined}/lib/libbox2d.a").absolutePath
    }

    addLinux(Architecture.Bitness._64, Architecture.x86)
    addMac(Architecture.Bitness._64, Architecture.ARM)
    addMac(Architecture.Bitness._64, Architecture.x86)
}