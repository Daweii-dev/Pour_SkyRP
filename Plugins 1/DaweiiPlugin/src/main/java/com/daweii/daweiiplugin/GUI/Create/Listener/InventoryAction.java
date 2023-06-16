package com.daweii.daweiiplugin.GUI.Create.Listener;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class InventoryAction implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event){


        InventoryView inv = event.getView();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();

        if(current == null) return;

        if(inv.getTitle().equals("nom")) {

            event.setCancelled(true);
            player.closeInventory();


            switch (current.getType()) {

                case CARVED_PUMPKIN:
                    player.setGameMode(GameMode.SPECTATOR);
                    break;

                case LEATHER_LEGGINGS:
                    player.chat("truc");
                    break;

                default:
                    break;
            }
        }
    }
}
