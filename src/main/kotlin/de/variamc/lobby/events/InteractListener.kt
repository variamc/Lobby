package de.variamc.lobby.events

import de.variamc.lobby.Lobby
import de.variamc.lobby.functionality.ClickAction
import de.variamc.lobby.gui.Navigator
import net.axay.kspigot.event.listen
import net.axay.kspigot.gui.openGUI
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.persistence.PersistentDataType

/**
 * Class created by Kaseax on 2022
 */
fun interactListener() {

    val interactEventListener = listen<PlayerInteractEvent> {
        val item = it.item ?: return@listen
            if (item.itemMeta.persistentDataContainer.has(Lobby.INSTANCE.clickActionKey)) {
                val action = item.itemMeta.persistentDataContainer[Lobby.INSTANCE.clickActionKey, PersistentDataType.INTEGER]
                when (action) {
                    ClickAction.OPEN_NAVIGATOR.id -> it.player.openGUI(Navigator.gui)
                }
            }
    }
}