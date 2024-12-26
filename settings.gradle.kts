rootProject.name = "gdx-box2d"

pluginManagement {
    repositories {
        mavenCentral() // Keep your existing repositories
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
            mavenContent {
                snapshotsOnly()
            }
        }
    }
}
