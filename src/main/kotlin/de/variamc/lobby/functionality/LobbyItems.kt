package de.variamc.lobby.functionality

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
import org.bukkit.entity.Player
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.SkullMeta
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

        val navigator = itemStack(Material.MUSIC_DISC_CAT) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.navigator"))
            meta {
                name = parsedMessage
            }
        }

        val playerHider = itemStack(Material.TOTEM_OF_UNDYING) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.playerhider"))
            meta {
                name = parsedMessage
            }
        }

        val gadget = itemStack(Material.FIREWORK_STAR) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.nogadget"))
            meta {
                name = parsedMessage
            }
        }

        val inventory = itemStack(Material.HOPPER_MINECART) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.inventory"))
            meta {
                name = parsedMessage
            }
        }

        val profile = itemStack(Material.SKELETON_SKULL) {
            amount = 1
            val parsedMessage: Component = mm.deserialize(resourceBundle.getString("hotbar.profile"))
            meta {
                name = parsedMessage
                (this as SkullMeta).owningPlayer = player
            }
        }

        player.inventory.setItem(1, navigator)
        player.inventory.setItem(2, playerHider)
        player.inventory.setItem(4, gadget)
        player.inventory.setItem(6, inventory)
        player.inventory.setItem(7, profile)
    }
}