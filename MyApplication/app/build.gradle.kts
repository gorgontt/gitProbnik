plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 29
        targetSdk = 34
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
}

dependencies {

    implementation(libs.firebase.database)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.firebase.auth)


    implementation (libs.cardview)
    implementation (libs.recyclerview)
    implementation (libs.constraintlayout.v204)


    implementation (libs.rey5137.material)
    implementation (libs.firebase.database.v1960)
    implementation (libs.firebase.storage)





    implementation (libs.paging.runtime)

    implementation (libs.firebase.ui.database.v802)
    implementation (libs.firebase.ui.storage)

    implementation (libs.firebase.core)
    implementation (libs.firebase.ads)
    implementation (libs.material.v125)

    implementation (libs.pilgr.paperdb)
    implementation (libs.material.v130)
    implementation (libs.navigation.fragment.v222)
    implementation (libs.navigation.ui.v235)
    implementation (libs.lifecycle.livedata.ktx.v220)
    implementation (libs.lifecycle.viewmodel.ktx.v220)
    implementation (libs.circleimageview)
    implementation (libs.android.image.cropper)
    implementation (libs.picasso)
    androidTestImplementation (libs.junit.v111)
    androidTestImplementation (libs.espresso.core.v320)
}