plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}
dependencies {
    api("javax.inject:javax.inject:1")
    implementation(Dependencies.Kotlin.core)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}