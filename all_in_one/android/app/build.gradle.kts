plugins {
    id("com.android.application")
    id("kotlin-android")
    
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.all_in_one"
    // compileSdk = flutter.compileSdkVersion
    // compileSdk = 34
    compileSdk = 36
    ndkVersion = "29.0.14206865"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        
        applicationId = "com.example.all_in_one"
        
        
        // minSdk = flutter.minSdkVersion
        minSdk = flutter.minSdkVersion
        // targetSdk = flutter.targetSdkVersion
        // targetSdk = 34
        targetSdk = 36
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            
            
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
