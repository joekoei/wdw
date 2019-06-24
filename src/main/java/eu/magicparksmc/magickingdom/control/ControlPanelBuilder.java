package eu.magicparksmc.magickingdom.control;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ControlPanelBuilder {
	private Inventory menu;

	public ControlPanelBuilder() {
		menu = Bukkit.createInventory(null, 18, "Control Panels");
		ItemStack i = new ItemStack(Material.ACACIA_BOAT);
		ItemMeta m = i.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Control Panel");
		m.setLore(lore);
		m.setDisplayName("Splash Mountain");
		i.setItemMeta(m);
	}

	public Inventory getMenu() {
		return menu;
	}
}