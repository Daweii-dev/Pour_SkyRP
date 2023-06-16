package com.daweii.daweiiplugin.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ListenerDaweii implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        Player player = event.getPlayer();

        if (player.isOp() == false) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInterractInventory(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (player.isOp() == false) {
            event.setCancelled(true);
        }
    }
}
