rootProject.name = "Lobby"

pluginManagement {
    repositories {
        gradlePluginPortal()
        // PaperMC Repo
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

sourceControl {
    gitRepository(java.net.URI("https://github.com/variamc/CoreAPI.git")) {
        producesModule("de.variamc:coreapi")
    }
}
