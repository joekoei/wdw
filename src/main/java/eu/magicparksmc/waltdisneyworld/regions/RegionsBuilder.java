package eu.magicparksmc.waltdisneyworld.regions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class RegionsBuilder {
	private Inventory menu;

	public RegionsBuilder() {
		menu = Bukkit.createInventory(null, 36, "Area's - Magic Kingdom");
		final ItemStack ft = new ItemStack(Material.WOODEN_HOE);
		final ItemMeta ftt = ft.getItemMeta();
		final ArrayList loreft = new ArrayList();
		loreft.add("See here all attractions in Frontierland");
		ftt.setDisplayName(ChatColor.GRAY + "Frontierland");
		ftt.setLore(loreft);
		ft.setItemMeta(ftt);

		menu.setItem(10, ft);
	}

	public Inventory getMenu() {
		return menu;
	}
}