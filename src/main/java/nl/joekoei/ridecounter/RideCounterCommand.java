package nl.joekoei.ridecounter;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import nl.joekoei.core.Core;

public class RideCounterCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("ridecounter")) {
                    if(args.length < 3){
                        RideCounterElement element = Core.getRidecounterConfig().getByPlayer(Bukkit.getPlayer(args[0]));
                        if(element != null){
                            element.count(args[1]);
                            Core.getRidecounterConfig().save();
                            Bukkit.broadcastMessage(args[0] + element.getData());
                        } else {
                        }
                    } else {
                        sender.sendMessage(ChatColor.RED + "Nope");
                    }
                }
        return false;
    }
}