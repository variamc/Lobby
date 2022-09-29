package de.variamc.lobby.events

import de.variamc.lobby.functionality.LobbyItems
import net.axay.kspigot.extensions.bukkit.feedSaturate
import net.axay.kspigot.extensions.bukkit.heal
import org.bukkit.entity.Player

/**
 * Class created by Kaseax on 2022
 */
object JoinPlayerReset {

    fun resetPlayer(player: Player) {
        player.feedSaturate()
        player.heal()
        player.inventory.clear()
        LobbyItems.givePlayer(player)
        for (potionEffect in player.activePotionEffects) {
            player.removePotionEffect(potionEffect.type)
        }
    }
}