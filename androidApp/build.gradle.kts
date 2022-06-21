plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.xl.kmmdemo.android"
        minSdk = 27
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
//    //Network
//    implementation(libs.ktor.core)
//    implementation(libs.ktor.logging)
    //Coroutines
    implementation(libs.kotlinx.coroutines.core)
//    //Logger
//    implementation(libs.napier)
//    //JSON
//    implementation(libs.kotlinx.serialization.json)
//    //Key-Value storage
//    implementation(libs.multiplatform.settings)
//    // DI
//    api(libs.koin.core)
//
//    implementation(libs.ktor.client.okhttp)
//
//    dependencies {
//        coreLibraryDesugaring(libs.desugar.jdk.libs)
//    }
}