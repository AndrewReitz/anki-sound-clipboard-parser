plugins {
    id("org.jetbrains.kotlin.js") version "1.4.10"
}

group = "cash.andrew.anki.clipboard"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.4.1")
    implementation(npm("copy-paste", "1.3.0"))
}

kotlin {
    js {
        nodejs()
        binaries.executable()
    }
}