package eu.magicparksmc.magickingdom.tomorrowland;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SpaceMountainCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("spacemountain")) {
			if (sender.hasPermission("operator.club33") || sender.hasPermission("operator.passholder")) {
				if (args.length == 0) {
					sender.sendMessage(ChatColor.RED + "You need to give arguments");
				} else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("power")) {
						Bukkit.broadcastMessage(args[0]);
						SpaceMountainBuilder m = new SpaceMountainBuilder();
						if (m.getMenu().getItem(1).getType() == Material.RED_CONCRETE) {
							sender.sendMessage(ChatColor.RED + "Werkt opzich");
							sender.sendMessage(m.getMenu().getItem(1).toString() + "  Voor de set");
							m.getMenu().getItem(1).setType(Material.GREEN_CONCRETE);
							sender.sendMessage(m.getMenu().getItem(1).toString() + "  Na de set");

						} else if (m.getMenu().getItem(1).getType() == Material.GREEN_CONCRETE) {
							m.getMenu().getItem(1).setType(Material.RED_CONCRETE);
							// TODO: Setten van de title ("OFF")
							/**
							 * ArrayList lore = new ArrayList(); lore.add("OFF");
							 * m.getMenu().getItem(1).setType(Material.RED_CONCRETE);
							 * m.getMenu().getItem(1).getItemMeta().setLore(lore);
							 */
						}
					}
				}
			} else {
				sender.sendMessage(
						ChatColor.RED + "Hey!" + ChatColor.GRAY + "You have no permission to perform this action");
			}
		}
		return false;
	}
}