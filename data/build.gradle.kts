plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = Android.groupId + "data"
    compileSdk = Android.compileSdkVersion

    defaultConfig {
        minSdk = Android.minSdkVersion
        targetSdk = Android.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {
    implementation(Libs.Common.kotlin)
    implementation(Libs.Common.coroutines)
    implementation(Libs.Common.coroutinesAndroid)
    implementation(Libs.Common.arrowCore)
    implementation(Libs.Common.arrowFx)
    implementation(Libs.Common.timber)

    // Project Submodules
    implementation(project(Libs.Modules.domain))

    // Hilt
    implementation(Libs.Common.hilt)
    kapt(Libs.Common.hiltCompiler)

    // Retrofit - OkHttp
    implementation(Libs.Common.retrofit)
    implementation(Libs.Common.retrofitMoshi)
    implementation(Libs.Common.okHttpInterceptor)

    // Test Dependencies
    testImplementation(Libs.Testing.junit)
    testImplementation(Libs.Testing.mockk)
    testImplementation(Libs.Testing.archTesting)
    testImplementation(Libs.Testing.coroutinesTest)
    testImplementation(Libs.Testing.truth)
    androidTestImplementation(Libs.Testing.testRunner)
}