plugins {
    id("java")
    id("com.badlogicgames.jnigen.jnigen-gradle") version "3.0.0-SNAPSHOT"
}

group = property("group") as String
version = property("version") as String

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}