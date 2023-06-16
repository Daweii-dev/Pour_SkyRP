package com.daweii.daweiiplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Food implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        player.sendMessage("Ca fonctionne");

        // esseille d'afficher la tete du jouer qui fait la commends dans le menu GUI
        Inventory inv = Bukkit.createInventory(null, 9, "PlayerHead");

        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta player_meta = playerHead.getItemMeta();
        player_meta.setDisplayName(player.getDisplayName());
        playerHead.setItemMeta(player_meta);
        inv.setItem(4, playerHead);


        player.openInventory(inv);


        return true;
    }

    public static ItemStack getItem(Material material, String customName) {

        ItemStack it = new ItemStack(material);
        ItemMeta itM = it.getItemMeta();
        if (customName != null) itM.setDisplayName(customName);
        it.setItemMeta(itM);

        return it;
    }
}
