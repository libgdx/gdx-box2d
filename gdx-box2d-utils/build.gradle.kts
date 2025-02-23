plugins {
    id("java-library")
}

val gdxVersion = property("gdx.version") as String

dependencies {
    api(project(":"))
    api("com.badlogicgames.gdx:gdx:${gdxVersion}")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation(project(path = ":", configuration = "archives"))
    testImplementation("com.badlogicgames.gdx:gdx-platform:${gdxVersion}:natives-desktop")
    testImplementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:${gdxVersion}")
}

tasks.test {
    outputs.upToDateWhen { false }
    dependsOn(":jnigenBuildHost")
    useJUnitPlatform()
}