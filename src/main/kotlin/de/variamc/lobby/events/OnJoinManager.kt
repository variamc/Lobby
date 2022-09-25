package de.variamc.lobby.events

import net.axay.kspigot.event.listen
import net.axay.kspigot.runnables.async
import org.bukkit.event.EventPriority
import org.bukkit.event.player.PlayerJoinEvent

/**
 * Class created by Kaseax on 2022
 */
object OnJoinManager {

    fun enable() {
        listen<PlayerJoinEvent>(EventPriority.HIGHEST) {
            it.joinMessage(null)
            val player = it.player
            JoinPlayerReset.resetPlayer(player)
            /**WarpsHolder.instance.spawn?.let { warp ->
                player.teleport(warp.location)
            }**/

            async {

            }
        }
    }
}