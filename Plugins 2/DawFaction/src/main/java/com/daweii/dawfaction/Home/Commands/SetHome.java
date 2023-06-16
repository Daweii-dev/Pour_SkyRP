package com.daweii.dawfaction.Home.Commands;

import com.daweii.dawfaction.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import sun.jvm.hotspot.gc.g1.HeapRegionManager;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class SetHome implements CommandExecutor {

    private Main main;

    public SetHome(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(label.equalsIgnoreCase("sethome")) {
            if (args.length == 1 ) {
                if (sender instanceof Player) {
                    final Player player = (Player)sender;
                    final UUID uuid = player.getUniqueId();
                    final Location location = player.getLocation();
                    final String nom = args.toString();
                    final File file = new File(main.getDataFolder(), "/homes.yml");
                    final YamlConfiguration configuration = YamlConfiguration.loadConfiguration(file);
                    final String key = "players." + player.getUniqueId();
                    configuration.set(key + args + ".world", location.getWorld().getName());
                    configuration.set(key + args + ".x", location.getX());
                    configuration.set(key + args + ".y", location.getY());
                    configuration.set(key + args + ".z", location.getZ());
                    configuration.set(key + args + ".yaw", location.getYaw());
                    configuration.set(key + args + ".pitch", location.getPitch());

                    try {
                        configuration.save(file);
                        player.sendMessage(ChatColor.GREEN + "C bon tu a un home");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        }
        return false;
    }
}
