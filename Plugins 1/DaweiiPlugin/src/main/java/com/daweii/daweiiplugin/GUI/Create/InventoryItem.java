package com.daweii.daweiiplugin.GUI.Create;

import com.daweii.daweiiplugin.GUI.Create.InventoryCollection;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryItem {

    public static void test2() {

        Inventory inv = InventoryCollection.inventories.get("test2");
        inv.setItem(0, getItem(Material.CARVED_PUMPKIN, "nom"));
        inv.setItem(1, getItem(Material.LEATHER_LEGGINGS, "Couleurs"));


    }

//    public static void PlayerHead() {
//        Inventory inv = InventoryCollection.inventories.get("PlayerHead");
//        inv.setItem(1, getItem(Material.PLAYER_HEAD, new Food()));
//    }

    public static ItemStack getItem(Material material, String customName) {

        ItemStack it = new ItemStack(material);
        ItemMeta itM = it.getItemMeta();
        if (customName != null) itM.setDisplayName(customName);
        it.setItemMeta(itM);

        return it;
    }
//        itM.addItemFlags(ItemFlag);


//        if (material == Material.LEATHER_HELMET  || material == Material.LEATHER_CHESTPLATE || material == Material.LEATHER_LEGGINGS || material == Material.LEATHER_BOOTS){
//            LeatherArmorMeta meta = (LeatherArmorMeta) it.getItemMeta();
//            meta.setColor(color);
//        }



}
