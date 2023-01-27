pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //maven { url = uri("https://jitpack.io" ) }
        //maven { url = uri("https://dl.bintray.com/arrow-kt/arrow-kt/") }

    }
}
rootProject.name = "MET Arts"
include(":app")
include(":data")
include(":domain")
