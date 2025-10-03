// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}

buildscript {
    dependencies {
        classpath(files("plugins/uts-kotlin-compiler-plugin-0.0.1.jar"))
        classpath(files("plugins/uts-kotlin-gradle-plugin-0.0.1.jar"))
    }
}