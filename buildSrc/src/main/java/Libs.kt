object Libs {
    object Plugins {
        const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val gradleVersions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersions}"
        const val ktlint = "com.pinterest:ktlint:${Versions.ktlint}"
        const val safeargs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationComponent}"
    }

    object Modules {
        const val data = ":data"
        const val domain = ":domain"
    }
    object Jetpack {
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.arch}"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.arch}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val annotations = "androidx.annotation:annotation:${Versions.material}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val navigationUi ="androidx.navigation:navigation-ui-ktx:${Versions.navigationComponent}"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationComponent}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object Common {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val arrowCore = "io.arrow-kt:arrow-core:${Versions.arrow}"
        const val arrowFx = "io.arrow-kt:arrow-fx-coroutines:${Versions.arrow}"
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
        const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    }

    object Testing {
        const val junit = "junit:junit:${Versions.junit}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
        const val testRunner = "androidx.test:runner:${Versions.testRunner}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
        const val archTesting = "androidx.arch.core:core-testing:${Versions.archTest}"
        const val truth = "com.google.truth:truth:${Versions.truth}"
    }
}