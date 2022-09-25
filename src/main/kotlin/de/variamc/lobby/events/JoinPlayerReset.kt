package de.variamc.lobby.events

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
        for (potionEffect in player.activePotionEffects) {
            player.removePotionEffect(potionEffect.type)
        }
    }
}