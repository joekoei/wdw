package eu.magicparksmc.magickingdom.status;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class StatusBuilder {
	private Inventory menu;

	public StatusBuilder() {
		menu = Bukkit.createInventory(null, 27, "Status Control Space Mountain");
		final ArrayList<String> lores = new ArrayList<>();
		lores.add(ChatColor.GRAY + "Click here to change the status");

		final ItemStack open = new ItemStack(Material.GREEN_CONCRETE);
		final ItemMeta openn = open.getItemMeta();
		openn.setDisplayName(ChatColor.GREEN + "Opened");
		openn.setLore(lores);
		open.setItemMeta(openn);

		final ItemStack closed = new ItemStack(Material.RED_CONCRETE);
		final ItemMeta closedd = closed.getItemMeta();
		closedd.setDisplayName(ChatColor.RED + "Closed");
		closedd.setLore(lores);
		closed.setItemMeta(closedd);

		final ItemStack maintenance = new ItemStack(Material.YELLOW_CONCRETE);
		final ItemMeta maintenancee = maintenance.getItemMeta();
		maintenancee.setLore(lores);
		maintenancee.setDisplayName(ChatColor.GOLD + "Maintenance");
		maintenance.setItemMeta(maintenancee);

		final ItemStack current = new ItemStack(Material.SIGN);
		final ItemMeta currentt = current.getItemMeta();
		final ArrayList<String> currenttt = new ArrayList<String>();
		StatusListener n = new StatusListener();
		currenttt.add(ChatColor.GRAY + "Current status is => " + n.getSpacestatus());
		currentt.setLore(currenttt);
		currentt.setDisplayName(ChatColor.DARK_GRAY + "Current Status");
		current.setItemMeta(currentt);

		menu.setItem(10, open);
		menu.setItem(12, closed);
		menu.setItem(14, maintenance);
		menu.setItem(16, current);
	}

	public Inventory getMenu() {
		return menu;
	}
}