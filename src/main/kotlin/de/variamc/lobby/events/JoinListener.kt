package de.variamc.lobby.events

import de.variamc.lobby.utils.MainScoreboard
import net.axay.kspigot.event.listen
import net.axay.kspigot.runnables.task
import net.kyori.adventure.bossbar.BossBar
import net.kyori.adventure.key.Key
import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.event.EventPriority
import org.bukkit.event.player.PlayerJoinEvent

/**
 * Class created by Kaseax on 2022
 */
fun joinListener() {

    val joinEventListener = listen<PlayerJoinEvent> {
        it.joinMessage(null)
        val player = it.player
        JoinPlayerReset.resetPlayer(player)
        val beaconActivate: Sound = Sound.sound(Key.key("block_beacon_activate"), Sound.Source.BLOCK, 1f, 1f)
        player.playSound(beaconActivate)
        MainScoreboard(player)
        var bossBar: BossBar = BossBar.bossBar(Component.text("VariaMC Discord » https://discord.gg/XBC8cxVnVg"),
            1F, BossBar.Color.BLUE, BossBar.Overlay.NOTCHED_12)

        player.showBossBar(bossBar)

        task (
            sync = false,
            period = 100
                ) {
            var host: Component = Component.text("Hosted by ??? » www/???")
            var discord: Component = Component.text("Hosted by ??? » www/???")
            bossBar.name(host)
            bossBar.name(discord)
        }
    }

}