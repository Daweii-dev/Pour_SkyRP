package com.daweii.daweiiplugin.Listener.on;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class onPlace implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();

        if (event.getBlock().getType() == Material.SAND) {
            ItemStack sand = new ItemStack(Material.SAND);
            player.getInventory().setItem(9, sand);

        }
    }
}
