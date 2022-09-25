package de.variamc.lobby.utils

import com.mojang.authlib.GameProfile
import com.mojang.authlib.properties.Property
import org.bukkit.inventory.meta.SkullMeta
import java.util.*

/**
 * Class created by Kaseax on 2022
 */

private fun textureProfile(b64: String): GameProfile {
    val profile = GameProfile(UUID(0, 0), "Player")
    profile.properties.put("textures", Property("textures", b64))
    return profile
}

fun SkullMeta.texture(b64: String) {
    try {
        val profileField = this.javaClass.getDeclaredField("profile")
        profileField.isAccessible = true
        profileField.set(this, textureProfile(b64))
    } catch (exception: NoSuchFieldException) {
        exception.printStackTrace()
    } catch (exception: IllegalArgumentException) {
        exception.printStackTrace()
    } catch (exception: IllegalAccessException) {
        exception.printStackTrace()
    }
}