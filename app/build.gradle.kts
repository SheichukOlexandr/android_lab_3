plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.lab3_"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.lab3_"
        minSdk = 35
        targetSdk = 35
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
        // Використання цілих чисел для вказівки версії Java
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_15 // Альтернативний спосіб посилання, якщо прямий імпорт не працює
        targetCompatibility = org.gradle.api.JavaVersion.VERSION_15 // Альтернативний спосіб посилання, якщо прямий імпорт не працює

        // АБО СПРОБУЙТЕ ЦЕ (ЧАСТО ПРАЦЮЄ):
        // sourceCompatibility = 15
        // targetCompatibility = 15
    }
    kotlinOptions {
        // Залишаємо jvmTarget "11" або змінюємо на "15", якщо потрібно
        jvmTarget = "15" // або "15"
    }
    buildToolsVersion = "35.0.1"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}