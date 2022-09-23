@file:UseSerializers(LocationSerializer::class)
package de.variamc.lobby.data.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import net.axay.kspigot.serialization.LocationSerializer
import org.bukkit.Location
import org.bukkit.Material

/**
 * Class created by Kaseax on 2022
 */
@Serializable
data class Warp(
    @SerialName("_id") val name: String,
    val location: Location,
    val description: String?,
    val icon: Material
)