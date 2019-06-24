package nl.joekoei.ridecounter;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import nl.joekoei.core.Core;

public class InfoCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("ride")) {
			if (args.length == 1) {
			}
			RideCounterElement element = Core.getRidecounterConfig().getByPlayer(Bukkit.getPlayer(args[0]));
			Bukkit.broadcastMessage(element.getUUID().toString() + " + " +  element.getData().get("wdw") + " + ");
		}
		return false;
	}
}