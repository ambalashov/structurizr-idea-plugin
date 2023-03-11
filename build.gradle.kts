plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.13.3"
}

group = "io.github.ambalashov"
version = "0.1"

repositories {
    mavenCentral()
}

intellij {
    version.set("2022.3")
    type.set("IC")

    plugins.set(listOf())
}

sourceSets["main"].java.srcDirs("src/main/gen")

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    patchPluginXml {
        sinceBuild.set("222.*")
        untilBuild.set("231.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}
