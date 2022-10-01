package de.variamc.lobby.functionality

import de.variamc.lobby.Lobby
import de.variamc.lobby.utils.texture
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.chat.literalText
import net.axay.kspigot.event.listen
import net.axay.kspigot.items.*
import net.axay.kspigot.utils.hasMark
import net.axay.kspigot.utils.mark
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.apache.commons.lang.LocaleUtils
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.entity.Player
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.SkullMeta
import org.bukkit.persistence.PersistentDataType
import java.util.ResourceBundle

/**
 * Class created by Kaseax on 2022
 */
object LobbyItems {

    fun givePlayer(player: Player) {

        val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale("en_US"))
        //val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale(LanguageAPI.getLanguage(player.getUniqueId().toString())
        var mm = MiniMessage.miniMessage();

        player.inventory.clear()

        val navigator = itemStack(Material.COMPASS) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.navigator"))
            meta {
                name = parsedMessage
                persistentDataContainer[Lobby.INSTANCE.clickActionKey, PersistentDataType.INTEGER] = ClickAction.OPEN_NAVIGATOR.id
            }
        }

        val lobbySwitcher = itemStack(Material.NETHER_STAR) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.lobbyswitcher"))
            meta {
                name = parsedMessage
                persistentDataContainer[Lobby.INSTANCE.clickActionKey, PersistentDataType.INTEGER] = ClickAction.OPEN_LOBBYSWITCHER.id
            }
        }

        val stock = itemStack(Material.CHEST) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.stock"))
            meta {
                name = parsedMessage
                persistentDataContainer[Lobby.INSTANCE.clickActionKey, PersistentDataType.INTEGER] = ClickAction.OPEN_STOCK.id
            }
        }

        val friends = itemStack(Material.SKELETON_SKULL) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.friends"))
            meta {
                name = parsedMessage
                (this as SkullMeta).owningPlayer = player
            }
        }

        val settings = itemStack(Material.COMPARATOR) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.settings"))
            meta {
                name = parsedMessage
            }
        }

        player.inventory.setItem(0, navigator)
        player.inventory.setItem(1, lobbySwitcher)
        player.inventory.setItem(4, stock)
        player.inventory.setItem(7, friends)
        player.inventory.setItem(8, settings)
    }
}