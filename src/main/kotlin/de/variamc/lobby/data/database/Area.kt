@file:UseSerializers(LocationSerializer::class)

package de.variamc.lobby.data.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import net.axay.kspigot.serialization.LocationSerializer
import org.bukkit.Location

/**
 * Class created by Kaseax on 2022
 */
@Serializable
data class Area(
    @SerialName("_id") val name: String,
    val loc1: Location,
    val loc2: Location
)