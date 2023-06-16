package com.daweii.dawfaction.Home.Commands;

import com.daweii.dawfaction.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.Locale;

public class Home implements CommandExecutor {

    private Main main;

    public Home(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("home")) {
            if (args.length == 1) {
                if (sender instanceof Player) {
                    final Player player = (Player)sender;
                    final String nom = args.toString();

                    final File file = new File(main.getDataFolder(), "/homes.yml");
                    final YamlConfiguration configuration = YamlConfiguration.loadConfiguration(file);

                    final String key = "players." + player.getUniqueId() + args;
                    final ConfigurationSection configurationSection = configuration.getConfigurationSection(key);

                    if (configuration == null) {
                        player.sendMessage(ChatColor.RED + "Ta pas de home");
                    } else {
                        final World world = Bukkit.getWorld(configurationSection.getString("world"));
                        final double x = configurationSection.getDouble("x");
                        final double y = configurationSection.getDouble("y");
                        final double z = configurationSection.getDouble("z");
                        final float yaw = (float) configurationSection.getDouble("yaw");
                        final float pitch = (float) configurationSection.getDouble("pitch");

                        final Location homeLocation = new Location(world, x, y, z, yaw, pitch);

                        player.teleport(homeLocation);
                        player.sendMessage(ChatColor.GREEN + "Tu a êtait TP");
                    }
                }
                return true;
            }
        }

        return false;
    }
}
