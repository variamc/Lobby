package de.variamc.lobby.gui

import io.github.variamc.coreapi.player.PlayerSettings
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.chat.literalText
import net.axay.kspigot.gui.GUIType
import net.axay.kspigot.gui.Slots
import net.axay.kspigot.gui.kSpigotGUI
import net.axay.kspigot.gui.rectTo
import net.axay.kspigot.items.addLore
import net.axay.kspigot.items.itemStack
import net.axay.kspigot.items.meta
import net.axay.kspigot.items.name
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder
import org.apache.commons.lang.LocaleUtils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import java.util.*

/**
 * Class created by Kaseax on 2022
 */
object Stock {

    val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale("en_US"))
    //val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale(LanguageAPI.getLanguage(player.getUniqueId().toString())
    var mm = MiniMessage.miniMessage();

    val gui = kSpigotGUI(GUIType.FIVE_BY_NINE) {
        val inventoryTitle: Component = mm.deserialize(resourceBundle.getString("stock.title"))
        title = inventoryTitle
        page(1) {

            placeholder(Slots.RowThreeSlotTwo rectTo Slots.RowThreeSlotEight, ItemStack(Material.WHITE_STAINED_GLASS_PANE))

            button(Slots.RowTwoSlotTwo, itemStack(Material.NAME_TAG) {
                meta {
                    val titles: Component = mm.deserialize(resourceBundle.getString("stock.titles"))
                    name = titles
                }
            }) { clickEvent ->

            }

            button(Slots.RowFourSlotTwo, itemStack(Material.LIME_DYE) {
                meta {
                    val visible: Component = mm.deserialize(resourceBundle.getString("stock.visible"), Placeholder.component("cosmetic", Component.text("Title")))
                    name = visible
                }
            }) { clickEvent ->

            }

            button(Slots.RowTwoSlotThree, itemStack(Material.BONE) {
                meta {
                    val pets: Component = mm.deserialize(resourceBundle.getString("stock.pets"))
                    name = pets
                }
            }) { clickEvent ->

            }

            button(Slots.RowFourSlotThree, itemStack(Material.LIME_DYE) {
                meta {
                    val visible: Component = mm.deserialize(resourceBundle.getString("stock.visible"), Placeholder.component("cosmetic", Component.text("Pet")))
                    name = visible
                }
            }) { clickEvent ->

            }

            button(Slots.RowTwoSlotFour, itemStack(Material.BLAZE_POWDER) {
                meta {
                    val particles: Component = mm.deserialize(resourceBundle.getString("stock.particles"))
                    name = particles
                }
            }) { clickEvent ->

            }

            button(Slots.RowFourSlotFour, itemStack(Material.LIME_DYE) {
                meta {
                    val visible: Component = mm.deserialize(resourceBundle.getString("stock.visible"), Placeholder.component("cosmetic", Component.text("Particle")))
                    name = visible
                }
            }) { clickEvent ->

            }

            button(Slots.RowTwoSlotFive, itemStack(Material.RED_WOOL) {
                meta {
                    val balloons: Component = mm.deserialize(resourceBundle.getString("stock.balloons"))
                    name = balloons
                }
            }) { clickEvent ->

            }

            button(Slots.RowFourSlotFive, itemStack(Material.LIME_DYE) {
                meta {
                    val visible: Component = mm.deserialize(resourceBundle.getString("stock.visible"), Placeholder.component("cosmetic", Component.text("Balloon")))
                    name = visible
                }
            }) { clickEvent ->

            }

            button(Slots.RowTwoSlotSix, itemStack(Material.NETHERITE_CHESTPLATE) {
                meta {
                    val armor: Component = mm.deserialize(resourceBundle.getString("stock.armor"))
                    name = armor
                }
            }) { clickEvent ->

            }

            button(Slots.RowFourSlotSix, itemStack(Material.LIME_DYE) {
                meta {
                    val visible: Component = mm.deserialize(resourceBundle.getString("stock.visible"), Placeholder.component("cosmetic", Component.text("Armor")))
                    name = visible
                }
            }) { clickEvent ->

            }

            button(Slots.RowTwoSlotSeven, itemStack(Material.FIREWORK_ROCKET) {
                meta {
                    val abilities: Component = mm.deserialize(resourceBundle.getString("stock.abilities"))
                    name = abilities
                }
            }) { clickEvent ->

            }

            button(Slots.RowFourSlotSeven, itemStack(Material.LIME_DYE) {
                meta {
                    val visible: Component = mm.deserialize(resourceBundle.getString("stock.visible"), Placeholder.component("cosmetic", Component.text("Abilitie")))
                    name = visible
                }
            }) { clickEvent ->

            }

            button(Slots.RowTwoSlotEight, itemStack(Material.BARRIER) {
                meta {
                    name = literalText("Soon") {
                        color = KColors.GOLD
                    }
                }
            }) { clickEvent ->

            }

            button(Slots.RowFourSlotEight, itemStack(Material.LIME_DYE) {
                meta {
                    val visible: Component = mm.deserialize(resourceBundle.getString("stock.visible"), Placeholder.component("cosmetic", Component.text("Soon")))
                    name = visible
                }
            }) { clickEvent ->

            }
        }
    }

}