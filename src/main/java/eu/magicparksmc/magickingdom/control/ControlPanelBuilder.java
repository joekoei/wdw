package eu.magicparksmc.magickingdom.control;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class ControlPanelBuilder {
	private Inventory menu;

	public ControlPanelBuilder() {
		menu = Bukkit.createInventory(null, 18, "Control Panels");
		ItemStack i = new ItemStack(Material.ACACIA_BOAT);
		ArrayList lore = new ArrayList();
		lore.add("Splash Mountain");
		i.getItemMeta().setLore(lore);
		i.getItemMeta().setDisplayName("Splash Mountain");
	}

	public Inventory getMenu() {
		return menu;
	}
}