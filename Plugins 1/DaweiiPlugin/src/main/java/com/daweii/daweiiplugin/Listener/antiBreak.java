package com.daweii.daweiiplugin.Listener;

import org.bukkit.BlockChangeDelegate;
import org.bukkit.Material;
import org.bukkit.command.PluginCommandYamlParser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class antiBreak implements Listener {
    @EventHandler
    public void antiBreack(BlockBreakEvent event) {
        if (event.getBlock().getType() == Material.GLASS || event.getBlock().getType() == Material.GLASS_PANE);
            event.setCancelled(true);
    }
}
