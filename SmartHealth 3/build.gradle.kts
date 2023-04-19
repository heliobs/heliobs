plugins {
    id("java")
    id("com.google.protobuf") version "0.9.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.protobuf:protobuf-java:3.21.7")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    implementation("org.jmdns:jmdns:3.5.8")
    implementation ("io.grpc:grpc-protobuf:1.54.0")
    implementation ("io.grpc:grpc-stub:1.54.0")
    compileOnly ("org.apache.tomcat:annotations-api:6.0.53")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}