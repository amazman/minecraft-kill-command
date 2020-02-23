package me.amazman.kill;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (label.equalsIgnoreCase("kill")) {
			if (sender instanceof Player) {
				Player plr = (Player) sender;
				plr.setHealth(0);
				for (Player on : Bukkit.getOnlinePlayers()) {
					on.sendMessage(plr.getName() + "killed themselves..");
				}
				
				return true;
			}
		}
		
		return false;
	}

}
