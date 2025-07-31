import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.jetbrainsKotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    `maven-publish`

    alias(libs.plugins.kotlin.plugin.serialization)
    alias(libs.plugins.ksp)
}

group = "com.cocot3ro.gh.deps"
version = "2.0.2-SNAPSHOT"

kotlin {
    jvm()

    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(project.dependencies.platform(libs.ktor.bom))
            implementation(libs.ktor.server.resources)
            implementation(libs.ktor.serialization.kotlinx.json)

            implementation(libs.kotlinx.serialization.json)
        }
    }
}

android {
    namespace = "com.cocot3ro.gh.almacen-service-network-model"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["kotlin"])
        }
    }

    repositories {
        mavenLocal()
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/cocot3ro/GestionHotel-deps")
            credentials {
                username = project.findProperty("gpr.user") as String
                password = project.findProperty("gpr.key") as String
            }
        }
    }
}