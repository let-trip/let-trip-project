plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
    id ("kotlin-parcelize")
}

android {
    namespace = "kh.edu.rupp.ite.let_trip_project"
    compileSdk = 34
    packagingOptions {
        exclude ("META-INF/AL2.0")
        exclude ("META-INF/LGPL2.1")
        exclude ("xsd/catalog.xml")
        exclude ("META-INF/DEPENDENCIES")
        exclude ("META-INF/LICENSE.md")
        exclude ("META-INF/NOTICE.md")
        exclude ("META-INF/META-INF/io.netty.versions.properties")
        exclude ("META-INF/io.netty.versions.properties")
        exclude ("META-INF/INDEX.LIST")

    }
    defaultConfig {
        applicationId = "kh.edu.rupp.ite.let_trip_project"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        viewBinding {
            enable = true
        }
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
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
        dataBinding = true
        buildConfig = true

    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }
}
kapt {
    correctErrorTypes = true
}



dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //Retrofit http logging
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.1")

    // Add Retrofit dependencies
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")


    //Hilt dependency injection
    implementation ("com.google.dagger:hilt-android:2.44.2")
    kapt ("com.google.dagger:hilt-compiler:2.47")
    implementation ("androidx.activity:activity-ktx:1.8.1")
    implementation ("com.android.tools.build:gradle:7.1.0") {
        exclude(group = "jakarta.activation", module = "jakarta.activation-api")
    }
    //For easy logging
    implementation ("com.jakewharton.timber:timber:5.0.1")
    //For data place holder display effect
    implementation ("com.facebook.shimmer:shimmer:0.5.0")
    //For ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation ("androidx.fragment:fragment-ktx:1.6.2")


}


