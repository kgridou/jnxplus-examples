val javaVersion: String by project

plugins {
	java
	id("org.springframework.boot")
	id("io.spring.dependency-management")
  checkstyle
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.toVersion(javaVersion)
}

repositories {
	mavenCentral()
}

dependencies {
  	implementation("org.springframework.boot:spring-boot-starter-web")
  	testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(project(":spring-boot:g-sb-lib"))
}

tasks.withType<Test> {
  useJUnitPlatform()
}

checkstyle {
  toolVersion = "10.3.3"
  configFile = rootProject.file("config/checkstyle/checkstyle.xml")
}
