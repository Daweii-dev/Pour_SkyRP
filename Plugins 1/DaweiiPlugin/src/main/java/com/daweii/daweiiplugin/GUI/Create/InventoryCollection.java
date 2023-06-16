package com.daweii.daweiiplugin.GUI.Create;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class InventoryCollection {
    final public static Map<String, Inventory> inventories = new HashMap<>();

    public static void create() {
        inventories.put("test", Bukkit.createInventory(null, 54));
        inventories.put("test2", Bukkit.createInventory(null, 9, "nom"));

    }

    public static void open(Player player, String inventoryName) {
        player.openInventory(inventories.get("test"));
        player.openInventory(inventories.get("test2"));


    }
}
