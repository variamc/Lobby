package de.variamc.lobby.utils

import de.variamc.lobby.LOBBY_PREFIX
import io.github.variamc.coreapi.coins.CoinAPI
import io.github.variamc.coreapi.scoreboard.ScoreboardBuilder
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.apache.commons.lang.LocaleUtils
import org.bukkit.entity.Player
import java.util.*

/**
 * Class created by Kaseax on 2022
 */
class MainScoreboard(player: Player?) : ScoreboardBuilder(player, "§eVaria§6MC") {

    val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale("en_US"))
    //val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale(LanguageAPI.getLanguage(player.getUniqueId().toString())
    var mm = MiniMessage.miniMessage();

    override fun createScoreboard() {
        setScore("§e", 15);
        val coins: Component = mm.deserialize(resourceBundle.getString("scoreboard.coins"))
        setScore("§6§l$coins", 14);
        setScore("§7" + CoinAPI.getCoins(player.uniqueId.toString()), 13);
        setScore("§b", 12);
        val rank: Component = mm.deserialize(resourceBundle.getString("scoreboard.rank"))
        setScore("§6§l$rank", 11);
        //TODO: Add CloudNet-API
        setScore("§7" + "Spieler", 10);
        setScore("§8", 9);
        //TODO: Add Real playtime
        val playTime: Component = mm.deserialize(resourceBundle.getString("scoreboard.playtime"))
        setScore("§6§l$playTime", 8);
        setScore("§7" + "1 Hour 15 minutes", 7);
        setScore("§c", 6);
    }
    override fun update() {}
}