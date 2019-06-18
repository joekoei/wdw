package eu.magicparksmc.magickingdom.adventureland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class JungleCruiseBuilder {
	private Inventory menu;

	public JungleCruiseBuilder() {
		menu = Bukkit.createInventory(null, 18, "Jungle Cruise");
	}

	public Inventory getMenu() {
		return menu;
	}
}