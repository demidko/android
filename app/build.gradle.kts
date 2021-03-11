import com.android.build.gradle.internal.dsl.SigningConfig
import org.gradle.api.JavaVersion.VERSION_1_8

plugins {
  id("com.android.application")
  kotlin("android")
}

android {
  compileSdkVersion(30)
  buildToolsVersion("30.0.3")

  defaultConfig {
    applicationId = "gq.reactive.moneymap"
    minSdkVersion(22)
    targetSdkVersion(30)
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }

    register("beta") {
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
      signingConfig = SigningConfig("shared").apply {
        keyAlias = "key0"
        keyPassword = "123456"
        storeFile = file("key")
        storePassword = "123456"
      }
    }
  }
  compileOptions {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
    useIR = true
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.0.0-beta01"
  }

  packagingOptions {
    resources {
      excludes.add("META-INF/*.kotlin_module")
      excludes.add("**.kotlin_builtins")
      excludes.add("**.kotlin_metadata")
    }
  }
}

dependencies {

  implementation("androidx.core:core-ktx:1.3.2")
  implementation("androidx.appcompat:appcompat:1.2.0")
  implementation("com.google.android.material:material:1.3.0")
  implementation("androidx.compose.ui:ui:1.0.0-beta01")
  implementation("androidx.compose.material:material:1.0.0-beta01")
  implementation("androidx.compose.ui:ui-tooling:1.0.0-beta01")
  implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0")
  implementation("androidx.activity:activity-compose:1.3.0-alpha03")
  implementation("com.natpryce:hamkrest:1.8.0.1")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.2")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}