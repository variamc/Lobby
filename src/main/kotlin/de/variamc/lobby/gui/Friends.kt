package de.variamc.lobby.gui

import de.variamc.lobby.utils.texture
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.chat.literalText
import net.axay.kspigot.gui.*
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
import org.bukkit.inventory.meta.SkullMeta
import java.util.*

/**
 * Class created by Kaseax on 2022
 */
object Friends {

    val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale("en_US"))

    //val resourceBundle: ResourceBundle = ResourceBundle.getBundle("lang.lobby", LocaleUtils.toLocale(LanguageAPI.getLanguage(player.getUniqueId().toString())
    var mm = MiniMessage.miniMessage();

    val gui = kSpigotGUI(GUIType.SIX_BY_NINE) {
        val inventoryTitle: Component = mm.deserialize(resourceBundle.getString("friends.title"))
        title = inventoryTitle
        page(1) {
            button(Slots.RowSixSlotOne, itemStack(Material.PLAYER_HEAD) {
                meta {
                    (this as SkullMeta).texture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTE5M2M4OWQxZGY2Nzk4NTRmMzNjMjIxNTI0N2I2NzZhMTU5ZDUzOTUzOTJkMGM2MWI4NDc2ZjgxM2Q5ZWRiMCJ9fX0=")
                    name = literalText("Name") {
                        color = KColors.GRAY
                    }.style(Style.style(TextDecoration.ITALIC))
                    addLore {
                        val offline: Component = mm.deserialize(
                            resourceBundle.getString("friends.offline"),
                            Placeholder.component("days", Component.text("1")),
                            Placeholder.component("hours", Component.text("13"))
                        )
                        +offline
                        +""
                        +"§8» §7Status"
                    }
                }
            }) { clickEvent ->
                //clickEvent.player.openGUI(Friends.manageGui)
            }

            previousPage(Slots.RowOneSlotOne, ItemStack(Material.RED_STAINED_GLASS_PANE))

            placeholder(Slots.RowOneSlotTwo rectTo Slots.RowOneSlotEight, ItemStack(Material.BLACK_STAINED_GLASS_PANE))

            button(Slots.RowOneSlotThree, itemStack(Material.SKULL_BANNER_PATTERN) {
                meta {
                    val status: Component = mm.deserialize(resourceBundle.getString("friends.status"))
                    name = status
                    addLore {
                        val set: Component = mm.deserialize(resourceBundle.getString("friends.status.set"))
                        +""
                        +""
                        +set
                    }
                }
            }) { clickEvent ->

            }

            button(Slots.RowOneSlotFive, itemStack(Material.TOTEM_OF_UNDYING) {
                meta {
                    val request: Component = mm.deserialize(resourceBundle.getString("friends.request"))
                    name = request
                    addLore {
                        val open: Component = mm.deserialize(resourceBundle.getString("friends.request.open"))
                        +""
                        +""
                        +open
                    }
                }
            }) { clickEvent ->

            }

            button(Slots.RowOneSlotSeven, itemStack(Material.COMPARATOR) {
                meta {
                    val settings: Component = mm.deserialize(resourceBundle.getString("friends.sett "))
                    name = settings
                }
            }) { clickEvent ->

            }

            nextPage(Slots.RowOneSlotNine, ItemStack(Material.RED_STAINED_GLASS_PANE))

        }
    }

    val manageGui = kSpigotGUI(GUIType.ONE_BY_NINE) {
        title = literalText("§8» §7Name")
        page(1) {
            button(Slots.RowOneSlotOne, itemStack(Material.PLAYER_HEAD) {
                meta {
                    (this as SkullMeta).texture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTE5M2M4OWQxZGY2Nzk4NTRmMzNjMjIxNTI0N2I2NzZhMTU5ZDUzOTUzOTJkMGM2MWI4NDc2ZjgxM2Q5ZWRiMCJ9fX0=")
                    name = literalText("Name") {
                        color = KColors.GRAY
                    }.style(Style.style(TextDecoration.BOLD))
                    addLore {
                        val offline: Component = mm.deserialize(
                            resourceBundle.getString("friends.offline"),
                            Placeholder.component("days", Component.text("1")),
                            Placeholder.component("hours", Component.text("13"))
                        )
                        val since: Component = mm.deserialize(
                            resourceBundle.getString("friends.since"),
                            Placeholder.component("date", Component.text("01.01.2022")),
                            Placeholder.component("time", Component.text("12:12"))
                        )
                        +offline
                        +""
                        +"§8» §7Status"
                        +""
                        +since
                    }
                }
            }) { clickEvent ->
                clickEvent.player.openGUI(Friends.gui)
            }

            button(Slots.RowOneSlotThree, itemStack(Material.LEATHER_BOOTS) {
                meta {
                    val jump: Component = mm.deserialize(resourceBundle.getString("friends.jump"))
                    name = jump
                }
            }) { clickEvent ->

            }

            button(Slots.RowOneSlotFour, itemStack(Material.GLASS_BOTTLE) {
                meta {
                    val invite: Component = mm.deserialize(resourceBundle.getString("friends.invite"))
                    name = invite
                }
            }) { clickEvent ->


            }

            button(Slots.RowOneSlotSix, itemStack(Material.BELL) {
                meta {
                    val notifications: Component = mm.deserialize(resourceBundle.getString("friends.notifications"))
                    name = notifications
                    addLore {
                        val default: Component = mm.deserialize(resourceBundle.getString("friends.notifications.default"))
                        +default
                    }
                }
            }) { clickEvent ->

            }

            button(Slots.RowOneSlotSeven, itemStack(Material.WRITABLE_BOOK) {
                meta {
                    val messages: Component = mm.deserialize(resourceBundle.getString("friends.messages"))
                    name = messages
                    addLore {
                        val default: Component = mm.deserialize(resourceBundle.getString("friends.messages.default"))
                        +default
                    }
                }
            }) { clickEvent ->

            }

            button(Slots.RowOneSlotNine, itemStack(Material.BARRIER) {
                meta {
                    val remove: Component = mm.deserialize(resourceBundle.getString("friends.remove"))
                    name = remove
                }
            }) { clickEvent ->

            }

        }
    }
}
