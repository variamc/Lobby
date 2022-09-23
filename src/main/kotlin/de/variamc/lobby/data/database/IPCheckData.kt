package de.variamc.lobby.data.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.litote.kmongo.serialization.InstantSerializer
import java.time.Instant

/**
 * Class created by Kaseax on 2022
 */

@Serializable
data class IPCheckData(
    @SerialName("_id") val ip: String,
    val isBad: Boolean,
    @Serializable(with = InstantSerializer::class) val expiresAt: Instant
)
