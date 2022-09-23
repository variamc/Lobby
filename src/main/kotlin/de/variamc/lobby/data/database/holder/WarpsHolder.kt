package de.variamc.lobby.data.database.holder


/**
 * Class created by Kaseax on 2022
 */
object WarpsHolder {

    var instance = WarpsHolderInstance()

    fun reloadWarp() {
        instance = WarpsHolderInstance()
    }
}

class WarpsHolderInstance {
   // val warps by lazy { DatabaseManager.warps.find().toList() }

   // val spawn by lazy { warps.find { it.name.equals(other = "Spawn", ignoreCase = true) } }
}