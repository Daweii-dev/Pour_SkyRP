package com.daweii.daweiiplugin.Listener.on;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class onRespawn implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        Player player = event.getPlayer();

        Location lobby = new Location(Bukkit.getWorld("lobby"), 0, -60, 0, -180, 0);
        player.teleport(lobby);
    }
}
