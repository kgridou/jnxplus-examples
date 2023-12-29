pluginManagement {
  val springBootVersion: String by settings
  val springDependencyManagementVersion: String by settings
  val kotlinVersion: String by settings
  val jnxplusGradlePluginVersion: String by settings
  plugins {
    id("org.springframework.boot") version springBootVersion
    id("io.spring.dependency-management") version springDependencyManagementVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("io.github.khalilou88.jnxplus") version jnxplusGradlePluginVersion
  }
}
rootProject.name = "root-project"
include(":spring-boot:spring-boot-app")
include(":spring-boot:spring-boot-lib")
include(":spring-boot:spring-boot-kt-app")
include(":spring-boot:spring-boot-kt-lib")
