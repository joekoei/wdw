package eu.magicparksmc.magickingdom.fantasyland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class PeterPanBuilder {
	private Inventory menu;

	public PeterPanBuilder() {
		menu = Bukkit.createInventory(null, 18, "Peter Pan's Flight");
	}

	public Inventory getMenu() {
		return menu;
	}
}