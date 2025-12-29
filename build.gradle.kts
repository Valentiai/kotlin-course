plugins {
    kotlin("jvm") version "2.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"));
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0");
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.0");

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(24)
}