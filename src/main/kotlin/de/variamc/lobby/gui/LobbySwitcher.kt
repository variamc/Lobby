package de.variamc.lobby.gui

import de.variamc.lobby.Lobby
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.chat.literalText
import net.axay.kspigot.event.listen
import net.axay.kspigot.gui.GUIType
import net.axay.kspigot.gui.Slots
import net.axay.kspigot.gui.kSpigotGUI
import net.axay.kspigot.items.addLore
import net.axay.kspigot.items.itemStack
import net.axay.kspigot.items.meta
import net.axay.kspigot.items.name
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import org.apache.commons.lang.LocaleUtils
import org.bukkit.Material
import org.bukkit.event.player.PlayerInteractEvent
import java.util.*

/**
 * Class created by Kaseax on 2022
 */
object LobbySwitcher {

    val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale("en_US"))
    //val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale(LanguageAPI.getLanguage(player.getUniqueId().toString())
    var mm = MiniMessage.miniMessage();

        val gui = kSpigotGUI(GUIType.ONE_BY_NINE) {
            val inventoryTitle: Component = mm.deserialize(resourceBundle.getString("lobbySwitcher.title"))
            title = inventoryTitle
            page(1) {
                button(Slots.RowOneSlotOne, itemStack(Material.ENDER_PEARL) {
                    meta {
                        name = literalText("Lobby 1") {
                            color = KColors.GRAY
                        }
                        addLore {
                            "§a" + Lobby.INSTANCE.server.onlinePlayers + "§7/§a" + Lobby.INSTANCE.server.maxPlayers
                        }
                    }
                }) { clickEvent ->

                }
            }
        }
    }
