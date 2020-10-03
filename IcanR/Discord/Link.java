package me.IcanR.Discord;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class Link implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("discord")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("*Thanks for join*");
				return true;
			}
			Player player = (Player) sender;
			if (!player.hasPermission("Discord.use")) {
				player.sendMessage(ChatColor.RED + "You cannot use this command");
				return true;
			}
			if (args.length == 0) {
				// /discord
				TextComponent message = new TextComponent("Click to link your discord");
				message.setColor(ChatColor.GOLD);
				message.setBold(true);
				message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/wkbSaEz"));
				message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, 
						new ComponentBuilder("Click here to link your discord account!").color(ChatColor.GRAY).italic(true).create()));
				player.spigot().sendMessage(message);
				return true;
			}
		}
		return false;
	}

}
