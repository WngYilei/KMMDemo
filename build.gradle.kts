buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:7.2.1")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
       maven {
           isAllowInsecureProtocol = true
           setUrl("http://47.97.251.64:8081/repository/maven-releases/") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
