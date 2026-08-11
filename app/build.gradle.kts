plugins {
    id("java")
    id("application")
    id("org.sonarqube") version "7.3.1.8318"
    id("checkstyle")
}

sonar {
    properties {
        property("sonar.projectKey", "Endurance9102_java-project-61")
        property("sonar.organization", "endurance9102")
    }
}


application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

group = "hexlet-code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}