package de.variamc.lobby

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.extensions.broadcast
import net.axay.kspigot.extensions.bukkit.info
import net.axay.kspigot.extensions.bukkit.success
import net.axay.kspigot.extensions.console
import net.axay.kspigot.extensions.onlinePlayers
import net.axay.kspigot.main.KSpigot
import net.axay.kspigot.sound.sound
import org.bukkit.Sound

/**
 * Class created by Kaseax on 2022
 */
class Lobby : KSpigot() {

    companion object {
        lateinit var INSTANCE: Lobby; private set
    }

    override fun load() {
        INSTANCE = this
        console.info("Loading Lobby Plugin...")
    }

    override fun startup() {
        onlinePlayers.forEach { it.sound(Sound.BLOCK_BEACON_ACTIVATE) }

        console.success("Lobby plugin enabled.")
    }

    override fun shutdown() {
        console.info("Shutting down Lobby plugin...")

        onlinePlayers.forEach { it.sound(Sound.BLOCK_BEACON_DEACTIVATE) }

        console.success("Shut down Lobby plugin.")
    }

}

val Manager by lazy { Lobby.INSTANCE }