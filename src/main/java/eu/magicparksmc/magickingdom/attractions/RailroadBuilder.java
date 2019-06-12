package eu.magicparksmc.magickingdom.attractions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class RailroadBuilder {
	private Inventory menu;

	public RailroadBuilder() {
		menu = Bukkit.createInventory(null, 9, "Park Train Control");
	}

	public Inventory getMenu() {
		return menu;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = (Player) sender;
		if (command.getName().equalsIgnoreCase("parktrain")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.DARK_RED + "Error!" + ChatColor.RED + " Use missing arguments");
			} else if (args.length == 1 && args[0].equalsIgnoreCase("operate")) {
				p.openInventory(menu);
			}
		}
		return false;
	}
}