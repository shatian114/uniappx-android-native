plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("io.dcloud.uts.kotlin")
}

android {
    namespace = "com.android.uniappxandroidnative"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.android.uniappxandroidnative"
        minSdk = 21
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
    kotlinOptions {
        jvmTarget = "1.8"
    }

    androidResources {
        additionalParameters += listOf("--auto-add-overlay")
        ignoreAssetsPattern = "!.svn:!.git:.*:!CVS:!thumbs.db:!picasa.ini:!*.scc:*~"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // uniappx
    implementation(
        fileTree(
            mapOf(
                "dir" to "libs",
                "include" to listOf("*.aar")
            )
        )
    )
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.appcompat:appcompat:1.0.0")
    implementation("androidx.exifinterface:exifinterface:1.3.6")
    implementation("androidx.localbroadcastmanager:localbroadcastmanager:1.0.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.webkit:webkit:1.6.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.viewpager2:viewpager2:1.1.0-beta02")
    implementation("com.alibaba:fastjson:1.2.83")
    implementation("com.facebook.fresco:fresco:3.1.3")
    implementation("com.facebook.fresco:middleware:3.1.3")
    implementation("com.facebook.fresco:animated-gif:3.1.3")
    implementation("com.facebook.fresco:webpsupport:3.1.3")
    implementation("com.facebook.fresco:animated-webp:3.1.3")
    implementation("com.github.bumptech.glide:glide:4.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.10")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    implementation("com.squareup.okhttp3:okhttp:3.12.12")
    implementation("com.github.getActivity:XXPermissions:18.63")
    implementation("net.lingala.zip4j:zip4j:2.11.5")
}