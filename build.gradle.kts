import com.badlogic.gdx.jnigen.commons.Architecture

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

jnigen {
    javaClass.superclass.getDeclaredField("sharedLibName").apply { isAccessible = true }.set(this, "gdx-box2d")
    generator {
        outputPath = file("src/main/java")
        basePackage = "com.badlogic.box2d"
        fileToParse = "box2d/box2d.h"
        options = arrayOf("-I" + file("box2d/include").absolutePath)
    }

    addLinux(Architecture.Bitness._64, Architecture.x86)
}