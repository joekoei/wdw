package eu.magicparksmc.magickingdom.status;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StatusCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("statuscontrol")) {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("space")) {
					StatusBuilder s = new StatusBuilder();
					Player player = (Player) sender;
					player.openInventory(s.getMenu());
				}
			}
		}

		return false;
	}
}