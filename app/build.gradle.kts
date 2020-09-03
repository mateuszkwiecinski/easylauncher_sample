plugins {
    id("com.starter.application.android") version "0.18.0"
    id("com.starter.easylauncher") version "3.2.0"
}

android {
    defaultConfig {
        applicationId = "com.example"
        minSdkVersion(21)
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.3.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.1")
}
