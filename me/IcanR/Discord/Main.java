package me.IcanR.Discord;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		this.getCommand("Discord").setExecutor(new Link());
	}
	
	@Override
	public void onDisable() {
		
	}
}
