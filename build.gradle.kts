
val javaVersion = 17

plugins {
    kotlin("jvm") version "1.7.10"
    id("io.papermc.paperweight.userdev") version "1.3.6"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
    id("xyz.jpenilla.run-paper") version "1.0.6"
}

group = "de.variamc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri ("https://jitpack.io") }
}

dependencies {
    // PaperMC Dependency
    paperDevBundle("1.19.2-R0.1-SNAPSHOT")

    // KSpigot Dependency
    implementation("net.axay:kspigot:1.19.0")

    // CoreAPI Dependency
    implementation("de.variamc:coreapi") {
        version {
            branch = "master"
        }
    }

}


tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "$javaVersion"
        }
    }
    compileJava {
        options.encoding = "UTF-8"
        options.release.set(javaVersion)
    }
    assemble {
        dependsOn(reobfJar)
    }
    runServer {
        minecraftVersion("1.19.2")
    }
}

bukkit {
    name = "Lobby"
    apiVersion = "1.19"
    authors = listOf(
        "VariaMC",
        "Kaseax"
    )
    main = "$group.de.variamc.lobby.Lobby"
    version = version.toString()
    libraries = listOf(
        "net.axay:kspigot:1.19.2"
    )
}