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
import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.text.minimessage.MiniMessage
import net.minecraft.world.level.levelgen.GenerationStep.Decoration
import org.apache.commons.lang.LocaleUtils
import org.bukkit.Material
import org.bukkit.event.player.PlayerInteractEvent
import java.util.*

/**
 * Class created by Kaseax on 2022
 */
object Navigator {

    val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale("en_US"))
    //val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale(LanguageAPI.getLanguage(player.getUniqueId().toString())
    var mm = MiniMessage.miniMessage();

       val gui = kSpigotGUI(GUIType.FIVE_BY_NINE) {
           val inventoryTitle: Component = mm.deserialize(resourceBundle.getString("navigator.title"))
           title = inventoryTitle
           page(1) {
               button(Slots.RowOneSlotThree, itemStack(Material.GRASS_BLOCK) {
                   meta {
                       name = literalText("Modus1") {
                           color = KColors.GOLD
                       }.style(Style.style(TextDecoration.ITALIC))
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowOneSlotFour, itemStack(Material.GOLD_INGOT) {
                   meta {
                       name = literalText("Modus2") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowOneSlotFive, itemStack(Material.IRON_CHESTPLATE) {
                   meta {
                       name = literalText("Modus3") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowOneSlotSix, itemStack(Material.SKELETON_SKULL) {
                   meta {
                       name = literalText("Modus4") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowOneSlotSeven, itemStack(Material.SKELETON_SKULL) {
                   meta {
                       name = literalText("Modus5") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowThreeSlotTwo, itemStack(Material.RED_MUSHROOM_BLOCK) {
                   meta {
                       name = literalText("Modus6") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowThreeSlotThree, itemStack(Material.IRON_SWORD) {
                   meta {
                       name = literalText("Modus7") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowThreeSlotFour, itemStack(Material.CLOCK) {
                   meta {
                       name = literalText("Modus8") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowThreeSlotSix, itemStack(Material.POPPED_CHORUS_FRUIT) {
                   meta {
                       name = literalText("Modus9") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowThreeSlotSeven, itemStack(Material.RED_BED) {
                   meta {
                       name = literalText("Modus10") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowThreeSlotEight, itemStack(Material.STICK) {
                   meta {
                       name = literalText("Modus11") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowFiveSlotThree, itemStack(Material.PRISMARINE_CRYSTALS) {
                   meta {
                       name = literalText("Modus12") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowFiveSlotFive, itemStack(Material.END_CRYSTAL) {
                   meta {
                       name = literalText("Spawn") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           "§8» §e" + Lobby.INSTANCE.server.onlinePlayers + " players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }

               button(Slots.RowFiveSlotSeven, itemStack(Material.PAINTING) {
                   meta {
                       name = literalText("Modus14") {
                           color = KColors.GOLD
                       }
                       addLore {
                           +"A Description."
                           +""
                           +"§8» §e1 players §aONLINE"
                       }
                   }
               }) { clickEvent ->

               }
           }
       }
   }
