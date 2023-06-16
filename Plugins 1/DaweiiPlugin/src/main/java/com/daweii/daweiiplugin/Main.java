package com.daweii.daweiiplugin;

import com.daweii.daweiiplugin.GUI.Create.Listener.InventoryAction;
import com.daweii.daweiiplugin.Listener.ListenerDaweii;
import com.daweii.daweiiplugin.Listener.antiBreak;
import com.daweii.daweiiplugin.Listener.on.*;
import com.daweii.daweiiplugin.Commands.Food;
import com.daweii.daweiiplugin.Commands.Staff.GM;
import com.daweii.daweiiplugin.Commands.Hub;
import com.daweii.daweiiplugin.Commands.Lobby;
import com.daweii.daweiiplugin.Commands.Staff.Vanish;
import com.daweii.daweiiplugin.GUI.Create.InventoryCollection;
import com.daweii.daweiiplugin.GUI.Create.InventoryItem;
import com.daweii.daweiiplugin.GUI.Test;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Main extends JavaPlugin {

    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("DaweiiPlugin ON");

        InventoryCollection.create();
        InventoryItem.test2();
        getServer().getPluginManager().registerEvents(new InventoryAction(), this);

        getCommand("hub").setExecutor(new Hub());
        getCommand("lobby").setExecutor(new Lobby());
        getCommand("food").setExecutor(new Food());
        getCommand("gm").setExecutor(new GM());
        getCommand("vanish").setExecutor(new Vanish(this));

        getServer().getPluginManager().registerEvents(new onJoin(this), this);
        getServer().getPluginManager().registerEvents(new onLeave(), this);
        getServer().getPluginManager().registerEvents(new onDied(), this);
        getServer().getPluginManager().registerEvents(new onRespawn(), this);
        getServer().getPluginManager().registerEvents(new antiBreak(), this);
        getServer().getPluginManager().registerEvents(new onPlace(), this);
        getServer().getPluginManager().registerEvents(new Test(), this);
        getServer().getPluginManager().registerEvents(new ListenerDaweii(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("DaweiiPlugin OFF");

    }
}
