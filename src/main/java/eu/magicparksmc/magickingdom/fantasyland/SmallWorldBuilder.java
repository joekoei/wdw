package eu.magicparksmc.magickingdom.fantasyland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class SmallWorldBuilder {
	private Inventory menu;

	public SmallWorldBuilder() {
		menu = Bukkit.createInventory(null, 18, "'it's a small world'");
	}

	public Inventory getMenu() {
		return menu;
	}
}