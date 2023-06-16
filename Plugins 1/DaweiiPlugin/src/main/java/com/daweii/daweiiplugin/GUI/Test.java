package com.daweii.daweiiplugin.GUI;

import com.daweii.daweiiplugin.GUI.Create.InventoryCollection;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Test implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack it = event.getItem();

        if (it != null && action == Action.RIGHT_CLICK_AIR &&it.getType() == Material.DIAMOND){
            player.chat("Test");
            player.setFoodLevel(20);
            InventoryCollection.open(player, "test2");



        }
    }
}
