// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    google()
    mavenCentral()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:7.0.0-alpha12")
    //noinspection GradleDependency
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")

    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
  }
}


task<Delete>("clean") {
  rootProject.buildDir.delete()
}