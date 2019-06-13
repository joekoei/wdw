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
}