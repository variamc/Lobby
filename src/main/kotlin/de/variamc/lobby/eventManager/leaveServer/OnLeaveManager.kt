package de.variamc.lobby.eventManager.leaveServer

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.event.listen
import net.axay.kspigot.extensions.broadcast
import org.bukkit.entity.Player
import org.bukkit.event.EventPriority
import org.bukkit.event.player.PlayerQuitEvent

/**
 * Class created by Kaseax on 2022
 */
object OnLeaveManager {

    val registeredKickReasons = HashMap<Player, String>()

    fun enable() {
        listen<PlayerQuitEvent>(EventPriority.HIGHEST) {
            val player = it.player
            val reason = registeredKickReasons.remove(player)

            it.quitMessage(null)

            if(reason != null) {
                broadcast(
                    StringBuilder().apply {
                        append("${KColors.PALEVIOLETRED}← ${KColors.GRAY}${player.name}")
                        append(" ${KColors.INDIANRED}${KColors.BOLD}$reason")
                    }.toString()
                )
            }
        }
    }
}