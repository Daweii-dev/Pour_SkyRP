package com.daweii.dawfaction;

import com.daweii.dawfaction.Commands.Staff.Vanish;
import com.daweii.dawfaction.Home.Commands.Home;
import com.daweii.dawfaction.Home.Commands.SetHome;
import com.daweii.dawfaction.Listener.DawListener;
import com.daweii.dawfaction.Listener.Fleur;
import com.daweii.dawfaction.Listener.Region;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Main extends JavaPlugin {

    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("DawFaction ON");

        getCommand("vanish").setExecutor(new Vanish(this));
        getCommand("sethome").setExecutor(new SetHome(this));
        getCommand("home").setExecutor(new Home(this));

        getServer().getPluginManager().registerEvents(new DawListener(), this);
        getServer().getPluginManager().registerEvents(new Region(), this);
        getServer().getPluginManager().registerEvents(new Fleur(), this);
//        getServer().getPluginManager().registerEvents(new TestNewCD(), this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("DawFaction OFF");
    }
}
