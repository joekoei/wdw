package eu.magicparksmc.magickingdom.tomorrowland;

import eu.magicparksmc.magickingdom.status.StatusBuilder;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SpaceMountainCommand implements CommandExecutor {
	public static String spacemountain;

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
						}
					}
					Map<String, StatusBuilder> status = new HashMap<>();
					String currentStatus = "closed";
					status.put("opened", new StatusBuilder("opened"));
					status.put("closed", new StatusBuilder("closed"));
					status.put("maintenance", new StatusBuilder("maintenance"));
						if (args[0].equalsIgnoreCase("status")) {
							Bukkit.broadcastMessage(currentStatus);
							if (!status.get(currentStatus).currentStatus) {
							StatusBuilder s = new StatusBuilder(currentStatus);
							if (spacemountain == null) {
								spacemountain = s.getClosed();
								changeStatus(s);
								Bukkit.broadcastMessage(spacemountain + " 1");
								Bukkit.broadcastMessage(currentStatus);
							} else if (currentStatus == "closed") {
								spacemountain = s.getOpened();
								changeStatus(s);
								Bukkit.broadcastMessage(spacemountain + " 2");
							} else if (currentStatus == "opened") {
								spacemountain = s.getClosed();
								changeStatus(s);
								Bukkit.broadcastMessage(spacemountain + " 3");
							}
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

	private void changeStatus(StatusBuilder status) {
		if (status == null) {
			status.getClosed();
			Bukkit.broadcastMessage(status + "");
		} else if (status.toString() == ChatColor.RED + "Closed") {
			status.getOpened();
			Bukkit.broadcastMessage(status + "");
		} else if (status.toString() == ChatColor.GREEN + "Opened") {
			status.getClosed();
			Bukkit.broadcastMessage(status + "");
		}
	}
}