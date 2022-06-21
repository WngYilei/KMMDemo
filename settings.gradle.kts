pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KMMDemo"
include(":androidApp")
include(":shared")

enableFeaturePreview("VERSION_CATALOGS")