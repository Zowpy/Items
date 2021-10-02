package me.zowpy.items.listener

import org.bukkit.entity.Item
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ItemSpawnEvent

class ItemDropListener: Listener {

    @EventHandler
    fun onSpawn(event: ItemSpawnEvent) {
        if (!event.isCancelled && event.entity != null) {
            var amount = event.entity.itemStack.amount

            for (entity in event.entity.getNearbyEntities(5.0, 5.0, 5.0)) {
                if (entity is Item) {
                    if (entity.itemStack.type == event.entity.itemStack.type) {
                        amount += entity.itemStack.amount
                    }

                }
            }

            event.entity.customName = event.entity.itemStack.type.name + " x" + amount
            event.entity.isCustomNameVisible = true
        }
    }
}

