pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://storage.zego.im/maven") // <- Add this line.
        maven(url = "https://www.jitpack.io") // <- Add this line.
    }
}

rootProject.name = "AudioBox"
include(":app")
