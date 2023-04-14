import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
    id("java")
    id("java-library")
    id("maven-publish")
    id("signing")
}

group = "com.github.hqqich"
version = "1.0.0"
description = "这是一个独立包"

//sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

buildscript{
    repositories {
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
    }
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.20")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

afterEvaluate {
    publishing {
        publications {
//            release(MavenPublication) {
////                artifacts {  }
////                artifactId = 'com.petterp.gradle.plugin'
////                from components.java
//            }
//            // Creates a Maven publication called "release".
//            release(MavenPublication) {
//                from components.release
//                        groupId = 'com.github.jitpack'
//                artifactId = 'android-example'
//                version = '1.0'
//            }
        }
    }
}
//application {
//    mainClass.set("MainKt")
//}