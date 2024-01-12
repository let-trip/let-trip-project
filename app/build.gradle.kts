import org.apache.tools.ant.util.JavaEnvUtils.VERSION_1_8

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
    id ("kotlin-parcelize")
}

android {
    namespace = "com.example.apptravel"
    compileSdk = 33
    kotlin {
        jvmToolchain(18)
    }

    defaultConfig {
        applicationId = "com.example.apptravel"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "18"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
        buildConfig = true
    }
}
kapt {
    var correctErrorTypes = true
}
dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.android.support:support-annotations:28.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //For serialization and deserialization data with API
    implementation ("com.google.code.gson:gson:2.10.1")

    //For ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.fragment:fragment-ktx:1.6.1")

    //Coroutine
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    //Retrofit2
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //Retrofit http logging
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.1")

    //Hilt dependency injection
    implementation ("com.google.dagger:hilt-android:2.44.2")
    kapt ("com.google.dagger:hilt-compiler:2.47")

    //For image loading
    implementation ("com.github.bumptech.glide:glide:4.15.1")

    //For data place holder display effect
    implementation ("com.facebook.shimmer:shimmer:0.5.0")

    //For pull and refresh action
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01")

    //For easy logging
    implementation ("com.jakewharton.timber:timber:5.0.1")

    //Splash screen
    implementation ("androidx.core:core-splashscreen:1.0.1")

}




