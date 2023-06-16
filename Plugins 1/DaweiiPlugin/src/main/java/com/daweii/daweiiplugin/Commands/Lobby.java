package com.daweii.daweiiplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Lobby implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (sender instanceof Player) {
            Location lobby = new Location(Bukkit.getWorld("lobby"), 0, -60, 0, -180, 0);
            player.sendMessage("Bienvenue au Lobby");

            player.teleport(lobby);
        }

        return false;
    }
}
