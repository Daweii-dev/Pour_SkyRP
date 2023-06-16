package com.daweii.dawfaction.Listener;

import com.daweii.dawfaction.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.*;

public class DawListener implements Listener {

    Main plugin;

    public void OnJoin(Main plugins) {this.plugin = plugins;}
    Location spawn = new Location(Bukkit.getWorld("world"), 0 ,60, 0, 0, 0);

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("["+ "§2+" +"§f]" + "§2 " + player.getName());

        player.teleport(spawn);

        player.sendMessage("Bienvenue sur ....");
        player.sendMessage("--------");
        player.sendMessage("§6Discord:§f https://discord.gg/VSHaCd9s7t");

        // First Join

        Integer firstJoin = player.getFireTicks();

        if (firstJoin <= 10){
            Bukkit.broadcastMessage("Bienvenue a §6§l" + player.getName() + "§f§l qui rejoin le serveur pour la premier fois !!!");
        }

        for (int i = 0; i < plugin.invisible_list.size(); i++){
            player.hidePlayer(plugin, plugin.invisible_list.get(i));
        }
    }


    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("["+ "§4-" +"§f]" + "§4 " + player.getName());
    }


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

    @EventHandler
    public void onBreackBlock(BlockBreakEvent event) {
        Player player = event.getPlayer();

        if (player.isOp() == false) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlaceBlock(BlockPlaceEvent event) {
        Player player = event.getPlayer();

        if (player.isOp() == false) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onDied(PlayerDeathEvent event) {
        Player victim = event.getEntity();
        Entity killer = victim.getKiller();

        event.setDeathMessage(victim.getName() + " est mort ");

        if (killer != null) {
            killer.sendMessage("+1 §2kill §f" + victim.getName());
            victim.sendMessage("+1 §4mort §fde " + killer.getName());
        }
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        Player player = event.getPlayer();

        player.teleport(spawn);
    }
}
