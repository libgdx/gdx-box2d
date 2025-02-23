import com.badlogic.gdx.jnigen.commons.Architecture
import com.badlogic.gdx.jnigen.commons.Os
import com.badlogic.gdx.jnigen.gradle.JnigenExtension.*
import kotlin.io.path.createTempDirectory

plugins {
    id("java-library")
    id("com.badlogicgames.jnigen.jnigen-gradle") version "3.0.0-SNAPSHOT"
}

val isReleaseBuild: Boolean
    get() = project.hasProperty("RELEASE")

val releaseRepositoryUrl: String
    get() = project.findProperty("RELEASE_REPOSITORY_URL")?.toString() ?: "https://oss.sonatype.org/service/local/staging/deploy/maven2/"

val snapshotRepositoryUrl: String
    get() = project.findProperty("SNAPSHOT_REPOSITORY_URL")?.toString() ?: "https://oss.sonatype.org/content/repositories/snapshots/"

val repositoryUsername: String
    get() = project.findProperty("MAVEN_USERNAME")?.toString() ?: ""

val repositoryPassword: String
    get() = project.findProperty("MAVEN_PASSWORD")?.toString() ?: ""

val jnigenVersion = property("jnigen.version") as String

dependencies {
    api("com.badlogicgames.jnigen:jnigen-loader:${jnigenVersion}")
    api("com.badlogicgames.jnigen:jnigen-runtime:${jnigenVersion}")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-desktop")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-ios")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-arm64-v8a")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-armeabi-v7a")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-x86")
    implementation("com.badlogicgames.jnigen:jnigen-runtime-platform:${jnigenVersion}:natives-x86_64")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly(files("build/jnigen/libs/gdx-box2d-natives-desktop.jar"))
}

tasks.javadoc {
    (options as StandardJavadocDocletOptions).apply {
        // TODO: Make gen rather generate valid javadoc
        addStringOption("Xdoclint:none,-missing", "-quiet")
    }
}

tasks.test {
    outputs.upToDateWhen { false }
    dependsOn("jnigenBuildHost", "jnigenPackageAllDesktop")
    useJUnitPlatform()
}

tasks.create("setup_box2d") {
    inputs.dir("box2d")
    inputs.file("patches/box2d_patches.patch")
    outputs.dir("build/box2d_patched")

    doFirst {
        file("build/box2d_patched").deleteRecursively()
    }
    doLast {
        copy {
            from("box2d")
            into("build/box2d_patched")
        }
        exec {
            commandLine = listOf("patch")
            workingDir = file("build/box2d_patched")
            args = listOf("-p1", "-i", file("patches/box2d_patches.patch").absolutePath)
        }
    }
}

fun cmakeBuild(installDir: File, taskName: String, toolchainFile: File, extraFlags: Array<String> = emptyArray(),
               buildFlags: Array<String> = emptyArray(), installFlags: Array<String> = emptyArray(), otherCFlags: String = ""): Task {
    return tasks.create("build_box2d_${taskName}") {
        group = "box2d"
        dependsOn("setup_box2d")
        inputs.dir("build/box2d_patched")
        doLast {
            val tmpDir = createTempDirectory("build_box2d_${taskName}").resolve("box2d").toFile()
            tmpDir.mkdirs()
            installDir.mkdirs()
            exec {
                commandLine = listOf("cmake")
                args = listOf("-B", tmpDir.absolutePath, "-S", file("build/box2d_patched").absolutePath,
                    "-DBOX2D_SAMPLES=OFF",
                    "-DBOX2D_VALIDATE=OFF",
                    "-DBOX2D_SANITIZE=OFF",
                    "-DBOX2D_UNIT_TESTS=OFF",
                    "-DBOX2D_BENCHMARKS=OFF",
                    "-DBOX2D_PROFILE=OFF",
                    "-DBOX2D_ENABLE_ASSERTIONS=ON",
                    "-DCMAKE_C_FLAGS=-fexceptions $otherCFlags",
                    "-DCMAKE_STAGING_PREFIX=${installDir.absolutePath}",
                    "-DCMAKE_INSTALL_LIBDIR=${installDir.toPath().resolve("libs")}",
                    "-DCMAKE_TOOLCHAIN_FILE=${toolchainFile.absolutePath}",
                    "-DCMAKE_BUILD_TYPE=Release",
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
    dependsOn(cmakeBuild(file("build/box2d/linux_arm"), "linux_arm", file("box2d_build/toolchain_linux_arm32.cmake"), otherCFlags = "-mfpu=neon"))
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

tasks.create("build_windows") {
    group = "box2d"
    dependsOn(cmakeBuild(file("build/box2d/windows_x86"), "windows_x86", file("box2d_build/toolchain_windows_i686.cmake"), otherCFlags = "-msse2"))
    dependsOn(cmakeBuild(file("build/box2d/windows_x86_64"), "windows_x86_64", file("box2d_build/toolchain_windows_x86_64.cmake")))
}

jnigen {
    javaClass.superclass.getDeclaredField("sharedLibName").apply { isAccessible = true }.set(this, "gdx-box2d")
    generator {
        outputPath = file("src/main/java")
        basePackage = "com.badlogic.gdx.box2d"
        fileToParse = "box2d/box2d.h"
        options = arrayOf("-I" + file("box2d/include").absolutePath, "-DNDEBUG", "-DB2_ENABLE_ASSERT")
    }

    all {
        var name = os.name.lowercase()
        if (os == Os.IOS)
            name = "ios_" + targetType.platformName

        val arch = architecture.name.lowercase() + (if(architecture == Architecture.x86 && bitness != Architecture.Bitness._32) "_" else "") + bitness.toSuffix()
        val combined = name + "_" + arch

        headerDirs += arrayOf("build/box2d/${combined}/include/")
        cFlags += arrayOf("-std=c11", "-fexceptions", "-DB2_ENABLE_ASSERT")
        cppFlags += arrayOf("-std=c++11", "-fexceptions", "-DB2_ENABLE_ASSERT")
        libraries += file("build/box2d/${combined}/libs/libbox2d.a").absolutePath
    }

    addLinux(x32, ARM)
    addLinux(x64, x86)
    addLinux(x64, ARM)
    addLinux(x64, RISCV)

    addWindows(x32, x86)
    addWindows(x64, x86)

    addMac(x64, ARM)
    addMac(x64, x86)

    addAndroid {
        libraries = arrayOf()
        androidApplicationMk += arrayOf("APP_PLATFORM := android-21",
            "APP_STRIP_MODE := none",
            "APP_STL := c++_shared")
        linkerFlags += "-stdlib=libc++"
        androidAndroidMkSharedLibModule += "LOCAL_WHOLE_STATIC_LIBRARIES := static_box2d"
        androidAndroidMk += arrayOf(
            "include \$(CLEAR_VARS)",
            "LOCAL_MODULE := static_box2d",
            "LOCAL_SRC_FILES := \$(realpath ${file("build/box2d/android").absoluteFile}/\$(TARGET_ARCH_ABI)/libs/libbox2d.a)",
            "LOCAL_EXPORT_C_INCLUDES := \$(realpath ${file("build/box2d/android/\$(TARGET_ARCH_ABI)/include/").absoluteFile})",
            "include \$(PREBUILT_STATIC_LIBRARY)")
    }
    addIOS()
}

artifacts {
    artifacts {
        val packageTasks = listOf(
            tasks.named("jnigenPackageAllAndroid"),
            tasks.named("jnigenPackageAllIOS"),
            tasks.named("jnigenPackageAllDesktop")
        )

        packageTasks.forEach { packageTask ->
            packageTask.get().outputs.files.forEach { file ->
                archives(file) {
                    builtBy(packageTask)
                }
            }
        }
    }
}

allprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")
    apply(plugin = "signing")

    group = property("group") as String
    version = property("version") as String + if (isReleaseBuild) "" else "-SNAPSHOT"

    repositories {
        mavenCentral()
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
            mavenContent {
                snapshotsOnly()
            }
        }
    }

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

        withSourcesJar()
        withJavadocJar()
    }

    configure<PublishingExtension> {
        publications {
            register("mavenJava", MavenPublication::class) {
                from(components["java"])

                versionMapping {
                    usage("java-api") {
                        fromResolutionOf("runtimeClasspath")
                    }
                    usage("java-runtime") {
                        fromResolutionResult()
                    }
                }

                pom {
                    name = property("POM_NAME") as String
                    description = property("POM_DESCRIPTION") as String
                    url = property("POM_URL") as String
                    licenses {
                        license {
                            name = property("POM_LICENCE_NAME") as String
                            url = property("POM_LICENCE_URL") as String
                            distribution = property("POM_LICENCE_DIST") as String
                        }
                    }
                    developers {
                        developer {
                            id = "Tomski"
                            name = "Tom Wojciechowski"
                            email = "tomwojciechowski@asidik.com"
                        }
                    }
                    scm {
                        connection = property("POM_SCM_CONNECTION") as String
                        developerConnection = property("POM_SCM_DEV_CONNECTION") as String
                        url = property("POM_SCM_URL") as String
                    }
                }
            }
        }
        repositories {
            maven {
                url = if(isReleaseBuild) uri(releaseRepositoryUrl) else uri(snapshotRepositoryUrl)

                if (repositoryUsername.isNotEmpty() || repositoryPassword.isNotEmpty()) {
                    credentials {
                        username = repositoryUsername
                        password = repositoryPassword
                    }
                }
            }
        }
    }

    val publishing = extensions.getByType<PublishingExtension>()
    configure<SigningExtension> {
        useGpgCmd()
        sign(publishing.publications)
    }

    //Simply using "required" in signing block doesn't work because taskGraph isn't ready yet.
    gradle.taskGraph.whenReady {
        tasks.withType<Sign> {
            onlyIf { isReleaseBuild }
        }
    }
}
