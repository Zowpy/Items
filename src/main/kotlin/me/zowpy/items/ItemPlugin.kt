package me.zowpy.items

import me.zowpy.items.listener.ItemDropListener
import org.bukkit.plugin.java.JavaPlugin

class ItemPlugin: JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(ItemDropListener(), this)

        logger.info("Items started!")
    }

    override fun onDisable() {

    }
}