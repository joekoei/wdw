package eu.magicparksmc.magickingdom.frontierland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class BigThunderMountainBuilder {

	private Inventory menu;

	public BigThunderMountainBuilder() {
		menu = Bukkit.createInventory(null, 18, "Big Thunder Mountain Railroad");
	}

	public Inventory getMenu() {
		return menu;
	}
}