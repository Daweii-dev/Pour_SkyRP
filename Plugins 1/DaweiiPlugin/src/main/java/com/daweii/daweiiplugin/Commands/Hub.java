package com.daweii.daweiiplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hub implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label,String[] args) {
        Player player = (Player) sender;

        if (sender instanceof Player) {
            Location hub = new Location(Bukkit.getWorld("World"), -271.5, 88, 23.5, 0, 0);
            player.sendMessage("Bienvenue au HUB");

            player.teleport(hub);
        }
        return false;
    }

}