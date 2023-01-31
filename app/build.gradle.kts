plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")

}

android {
    compileSdk = Android.compileSdkVersion

    defaultConfig {
        applicationId = Android.applicationId
        minSdk = Android.minSdkVersion
        targetSdk = Android.targetSdkVersion
        versionCode = Android.versionCode
        versionName = Android.versionName


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
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
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
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
    implementation(project(Libs.Modules.data))
    implementation(project(Libs.Modules.domain))

    // Jetpack
    implementation(Libs.Jetpack.viewModelKtx)
    implementation(Libs.Jetpack.coreKtx)
    implementation(Libs.Jetpack.material)
    implementation(Libs.Jetpack.constraintLayout)
    implementation(Libs.Jetpack.navigationFragment)
    implementation(Libs.Jetpack.navigationUi)
    implementation(Libs.Jetpack.fragment)

    // Hilt
    implementation(Libs.Common.hilt)
    kapt(Libs.Common.hiltCompiler)

    // Retrofit - OkHttp
    implementation(Libs.Common.retrofit)
    implementation(Libs.Common.retrofitMoshi)
    implementation(Libs.Common.okHttpInterceptor)

    // Glide
    implementation(Libs.Common.glide)
    annotationProcessor(Libs.Common.glideCompiler)

    // Test Dependencies
    testImplementation(Libs.Testing.junit)
    testImplementation(Libs.Testing.mockk)
    testImplementation(Libs.Testing.archTesting)
    testImplementation(Libs.Testing.coroutinesTest)
    testImplementation(Libs.Testing.truth)
    androidTestImplementation(Libs.Testing.testRunner)
    androidTestImplementation(Libs.Testing.espresso)
}

kapt {
    correctErrorTypes = true
}