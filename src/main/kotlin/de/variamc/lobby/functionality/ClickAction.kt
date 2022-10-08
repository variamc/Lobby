package de.variamc.lobby.functionality

import de.variamc.lobby.Lobby
import org.bukkit.NamespacedKey

/**
 * Class created by Kaseax on 2022
 */
enum class ClickAction(val id: Int) {

    OPEN_NAVIGATOR(1),
    OPEN_LOBBYSWITCHER(2),
    OPEN_STOCK(3),
    OPEN_FRIENDS(4)
}