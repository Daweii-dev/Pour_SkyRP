package com.daweii.daweiiplugin.Listener.on;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onLeave implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent event){

        Player player = event.getPlayer();

        event.setQuitMessage("["+ "§4-" +"§f]" + "§4 " + player.getName());
    }
}
