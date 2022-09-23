package de.variamc.lobby.eventManager.leaveServer

import net.axay.kspigot.event.listen
import org.bukkit.event.EventPriority
import org.bukkit.event.player.PlayerKickEvent

/**
 * Class created by Kaseax on 2022
 */
object KickMessageListener {

    fun enable() {
        listen<PlayerKickEvent>(priority = EventPriority.LOWEST) {
            OnLeaveManager.registeredKickReasons[it.player] = it.reason
        }
    }
}