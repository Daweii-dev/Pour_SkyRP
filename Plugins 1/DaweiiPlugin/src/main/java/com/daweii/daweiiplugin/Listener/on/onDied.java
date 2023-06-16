package com.daweii.daweiiplugin.Listener.on;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onDied implements Listener {

    @EventHandler
    public void onDied(PlayerDeathEvent event) {
        Player victim = event.getEntity();
        Player killer = victim.getKiller();

        Bukkit.broadcastMessage(victim + " a etait tuer par " + killer);
        killer.sendMessage("+1 §2kill §f" + victim);
        victim.sendMessage("+1 §4mort §fde " + killer);
    }
}
