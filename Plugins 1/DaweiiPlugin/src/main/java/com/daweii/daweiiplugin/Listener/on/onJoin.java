package com.daweii.daweiiplugin.Listener.on;

import com.daweii.daweiiplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {
    @EventHandler
    public void OnJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        event.setJoinMessage("["+ "§2+" +"§f]" + "§2 " + player.getName());

        Location lobby = new Location(Bukkit.getWorld("lobby"), 0, -60, 0, -180, 0);
        player.teleport(lobby);

        player.sendMessage("Bienvenue sur ....");
        player.sendMessage("--------");
        player.sendMessage("§6Discord:§f https://discord.gg/VSHaCd9s7t");

        player.sendTitle("§6Bienvenue sur ....", " ",10, 70, 20);


    }

    @EventHandler
    public  void onFirstJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        Integer firstJoin = player.getFireTicks();

        if (firstJoin == 0){
            Bukkit.broadcastMessage("Bienvenue a §6§l" + player + "§f§l qui rejoin le serveur pour la premier fois !!!");

        }
    }

    Main plugin;
    public onJoin(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        for (int i = 0; i < plugin.invisible_list.size(); i++){
            player.hidePlayer(plugin, plugin.invisible_list.get(i));
        }
    }
}
