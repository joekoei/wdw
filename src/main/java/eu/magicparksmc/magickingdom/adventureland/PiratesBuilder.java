package eu.magicparksmc.magickingdom.adventureland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class PiratesBuilder {
	private Inventory menu;

	public PiratesBuilder() {
		menu = Bukkit.createInventory(null, 18, "Pirates of the Caribbean");
	}

	public Inventory getMenu() {
		return menu;
	}
}