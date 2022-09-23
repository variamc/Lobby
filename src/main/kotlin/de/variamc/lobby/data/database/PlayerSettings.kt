@file:UseSerializers(LocationSerializer::class)

package de.variamc.lobby.data.database

import com.github.jershell.kbson.UUIDSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import net.axay.kspigot.serialization.LocationSerializer
import org.bukkit.Location
import java.util.*

/**
 * Class created by Kaseax on 2022
 */

@Serializable
data class PlayerSettings(

    @Serializable(with = UUIDSerializer::class) @SerialName("_id") val uuid: UUID,

    val customSpawnLoc: Location? = null,
    val privacySettigns: PlayerPrivacySettings = PlayerPrivacySettings(),
    val ifSeeJoinMessages: Boolean = true,
    val visibilitySettings: PlayerVisibilitySettings = PlayerVisibilitySettings.SHOW_ALL
) {

    @Serializable
    data class PlayerPrivacySettings(
        val ifContinent: Boolean = false,
        val ifCountry: Boolean = false,
        val ifState: Boolean = false,
        val ifCity: Boolean = false,
    ) {
        val ifLoadAny get() = ifContinent || ifContinent || ifState || ifCity
    }

    enum class PlayerVisibilitySettings {
        SHOW_ALL, ONLY_FRIENDS, HIDE_ALL
    }

}
