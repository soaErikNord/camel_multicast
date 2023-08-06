plugins {
	java
	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"
}

group = "com.eknord"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.apache.camel.springboot:camel-spring-boot-starter:4.0.0-RC1")
	implementation("org.springframework.boot:spring-boot-configuration-processor")
	implementation("org.apache.camel.springboot:camel-core-starter:3.20.2")
	implementation("org.apache.camel.springboot:camel-spring-boot-starter:3.20.2")
	implementation("org.apache.camel.springboot:camel-spring-boot-dependencies:3.20.2")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
