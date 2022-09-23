@file:Suppress("MemberVisibilityCanBePrivate")
package de.variamc.lobby.data.database.holder

import net.axay.kspigot.event.listen
import org.bukkit.entity.Player
import org.bukkit.event.EventPriority
import org.bukkit.event.player.PlayerQuitEvent
import org.litote.kmongo.eq
import org.litote.kmongo.findOne

/**
 * Class created by Kaseax on 2022
 */

/*
object PlayerSettingsHolder {
    private val playerSettings = mutableMapOf<Player, PlayerSettings>()
    private fun loadFromDatabase(player: Player)
        = (
            DatabaseManager.playerSettings.findOne(PlayerSettings::uuid eq player.uniqueId)
                ?: PlayerSettings(player.uniqueId).apply {
                    DatabaseManager.playerSettings.insertOneCatchDuplicate(this@apply)
                }
        ).apply { playerSettings[player] = this@apply }
    operator fun get(player: Player)
        = playerSettings[player] ?: loadFromDatabase(player)
    fun enable() {
        listen<PlayerQuitEvent>(EventPriority.HIGHEST) {
            playerSettings -= it.player
        }
    }
}
 */