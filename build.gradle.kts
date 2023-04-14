import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
    id("java")
    id("java-library")
    id("maven-publish")
    id("signing")
}

publishing {
    publications {
        create("maven_public", MavenPublication::class) {
            groupId = "com.github.hqqich"
            artifactId = "library"
            version = "1.0.4"
            from(components.getByName("java"))
        }
    }
}


group = "com.github.hqqich"
version = "1.0.4"
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
//        classpath("com.android.tools.build:gradle:4.0.0")
//        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
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