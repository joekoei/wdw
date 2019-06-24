package nl.joekoei.ridecounter.gui;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import nl.joekoei.core.Core;
import nl.joekoei.ridecounter.RideCounterElement;

public class RideCounterGUICommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("ridecountermenu")) {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("tomorrowland")) {
					Player player = (Player) sender;
					final Inventory menu = Bukkit.createInventory(player, 9, "Tomorrowland Rides");
					RideCounterElement element = Core.getRidecounterConfig()
							.getByPlayer(Bukkit.getPlayer(player.getUniqueId()));

					// Space Mountain //
					ItemStack m = new ItemStack(Material.DIAMOND_SWORD);
					ItemMeta mm = m.getItemMeta();
					ArrayList a = new ArrayList();
					a.add(ChatColor.RED + "" + element.getData().get("space_mountain") + " Rides");
					mm.setDisplayName(ChatColor.RED + "Spacemountain");
					mm.setLore(a);
					m.setItemMeta(mm);

					//

					menu.setItem(0, m);

					player.openInventory(menu);
				}
				if (args[0].equalsIgnoreCase("frontierland")) {
					Player player = (Player) sender;
					final Inventory menu = Bukkit.createInventory(player, 9, "Frontier Land");
					RideCounterElement element = Core.getRidecounterConfig()
							.getByPlayer(Bukkit.getPlayer(player.getUniqueId()));

					// Big Thunder Mountain //
					ItemStack btm = new ItemStack(Material.DIAMOND_SWORD);
					ItemMeta metabtm = btm.getItemMeta();
					ArrayList btmride = new ArrayList();
					btmride.add(ChatColor.GRAY + "Total Rides: " + element.getData().get("big_thunder_mountain"));
					metabtm.setDisplayName(ChatColor.GOLD + "Big Thunder Mountain");
					metabtm.setLore(btmride);
					btm.setItemMeta(metabtm);

					menu.setItem(0, btm);

				}
			}
		}
		return false;
	}
}