object Version {
    const val androidXKtxBoom= "1.8.0"
    const val androidXLifecycleRuntimeKTX = "2.3.1"
    const val composeBoom = "2022.10.00"
    const val composeActivity = "1.5.1"
    const val coroutinesCore = "1.6.4"
    const val retrofitCore = "2.9.0"
    const val okhttp3LoggingInterceptor = "4.10.0"
    const val daggerHiltCore = "2.45"
    const val daggerHiltAndroidXCompiler = "1.0.0"
    const val testImplementationJunit = "4.13.2"
    const val androidTestImplementationJunit = "1.1.5"
    const val androidTestImplementationEspresso = "3.5.1"
    const val daggerHiltNavigationCompose = "1.0.0"
    const val androidXAppCompat = "1.6.1"
    const val materialCore = "1.9.0"
    const val composeNavigation = "2.5.3"
}

object AndroidX {
    const val ktxBoom = "org.jetbrains.kotlin:kotlin-bom:${Version.androidXKtxBoom}"
    const val coreKTX = "androidx.core:core-ktx:${Version.androidXKtxBoom}"
    const val lifecycleRuntimeKTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.androidXLifecycleRuntimeKTX}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.androidXAppCompat}"
}

object Compose {
    const val boom = "androidx.compose:compose-bom:${Version.composeBoom}"
    const val activity = "androidx.activity:activity-compose:${Version.composeActivity}"
    const val ui = "androidx.compose.ui:ui"
    const val uiGraphics = "androidx.compose.ui:ui-graphics"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val material3 = "androidx.compose.material3:material3"
    const val navigation = "androidx.navigation:navigation-compose:${Version.composeNavigation}"
}

object Material {
    const val core = "com.google.android.material:material:${Version.materialCore}"
}

object Coroutines {
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutinesCore}"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutinesCore}"
}

object Retrofit {
    const val core = "com.squareup.retrofit2:retrofit:${Version.retrofitCore}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Version.retrofitCore}"
    const val okhttp3LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okhttp3LoggingInterceptor}"
}

object DaggerHilt {
    const val core = "com.google.dagger:hilt-android:${Version.daggerHiltCore}"
    const val compiler = "com.google.dagger:hilt-android-compiler:${Version.daggerHiltCore}"
    const val androidXCompiler = "androidx.hilt:hilt-compiler:${Version.daggerHiltAndroidXCompiler}"
    const val navigationCompose = "androidx.hilt:hilt-navigation-compose:${Version.daggerHiltNavigationCompose}"
}

object TestImplementation {
    const val junit = "junit:junit:${Version.testImplementationJunit}"
}

object AndroidTestImplementation {
    const val junit = "androidx.test.ext:junit:${Version.androidTestImplementationJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.androidTestImplementationEspresso}"
    const val junitUITest = "androidx.compose.ui:ui-test-junit4"
}

object DebugImplementation {
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
}
