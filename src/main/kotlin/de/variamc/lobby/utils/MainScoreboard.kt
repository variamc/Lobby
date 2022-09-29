package de.variamc.lobby.utils

import de.variamc.lobby.LOBBY_PREFIX
import io.github.variamc.coreapi.coins.CoinAPI
import io.github.variamc.coreapi.scoreboard.ScoreboardBuilder
import org.bukkit.entity.Player

/**
 * Class created by Kaseax on 2022
 */
class MainScoreboard(player: Player?) : ScoreboardBuilder(player, "§eVaria§6MC") {

    override fun createScoreboard() {
        setScore("§e", 15);
        setScore("§6§lCoins", 14);
        setScore("§7" + CoinAPI.getCoins(player.uniqueId.toString()), 13);
        setScore("§b", 12);
        setScore("§6§lDein Rang", 11);
        //TODO: Add CloudNet-API
        setScore("§7" + "Spieler", 10);
        setScore("§8", 9);
        //TODO: Add Real playtime
        setScore("§6§lSpielzeit", 8);
        setScore("§7" + "1 Stunde 15 Minuten", 7);
        setScore("§c", 6);
    }
    override fun update() {}
}