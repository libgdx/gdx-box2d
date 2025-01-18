rootProject.name = "gdx-box2d"

include("gdx-box2d-utils")

pluginManagement {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
            mavenContent {
                snapshotsOnly()
            }
        }
    }
}
