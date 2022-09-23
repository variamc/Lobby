package de.variamc.lobby

import com.google.gson.Gson

/**
 * Class created by Kaseax on 2022
 */

const val PLUGIN_NAME = "lobby"
const val PLUGIN_DATA_PREFIX = "${PLUGIN_NAME}_"
const val LOBBY_PREFIX = "§8» §eVaria§6MC §r"

fun lobbyPermission(perm: String) = "${PLUGIN_NAME}.$perm"

val gson by lazy { Gson() }