plugins {
    id("setup")
    id("java-test-fixtures")
}

dependencies {
    implementation(libs.coroutines.core)
    api(projects.j2kIntellijEnv) {
        targetConfiguration = "shadow"
    }

    testImplementation(kotlin("test"))
}
