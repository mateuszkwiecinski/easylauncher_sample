plugins {
    id("com.starter.application.android")
    id("com.starter.easylauncher")
}
android {
    defaultConfig {
        applicationId = "com.example"
        minSdkVersion(21)
    }
    buildTypes {
        named("debug")
        named("release")
        register("beta")
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
}

easylauncher {
    iconNames.add("@mipmap/ic_launcher") // optional, disables automatic launcher icon discovery and will use provided icons only

    buildTypes {
        register("beta") {
            // icon names can also be provided per each configuration (buildType, productFlavor or variant)
            iconNames.add("@mipmap/ic_launcher")
        }
    }
}
