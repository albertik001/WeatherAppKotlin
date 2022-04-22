// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Dependencies.AGP.application) version Dependencies.AGP.version apply false
    id(Dependencies.AGP.library) version Dependencies.AGP.version apply false

    kotlin("android") version "1.6.21" apply false
    // Navigation Safe Args
    id(Dependencies.Navigation.safeArgsPlugin) version Dependencies.Navigation.version apply false

    // Hilt
    id(Dependencies.Hilt.plugin) version Dependencies.Hilt.version apply false
}