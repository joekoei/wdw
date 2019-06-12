package nl.joekoei.control;

import nl.joekoei.adventureland.*;
import nl.joekoei.attractions.*;
import nl.joekoei.fantasyland.*;
import nl.joekoei.frontierland.*;
import nl.joekoei.libertysquare.*;
import nl.joekoei.tomorrowland.*;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class controlCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("control")) {
            if (sender.hasPermission("mw")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "You need to give a argument!");
                }

                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("parktrain")) {
                        parktrainBuilder m = new parktrainBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("btm")) {
                        btmBuilder m = new btmBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("hm")) {
                        hauntedBuilder m = new hauntedBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("space")) {
                        spaceBuilder m = new spaceBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("splash")) {
                        splashBuilder m = new splashBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("barn")){
                        barnBuilder m = new barnBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("mcoa")){
                        magiccarpetsBuilder m = new magiccarpetsBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());


                    } else if (args[0].equalsIgnoreCase("help")) {
                        sender.sendMessage(ChatColor.RED + "--=-=--");
                        sender.sendMessage("");
                        sender.sendMessage("Control Panels" + ChatColor.GREEN + " Available");
                        sender.sendMessage("btm, hm, space, splash, parktrain, barn, mcoa");
                        sender.sendMessage("");
                        sender.sendMessage(ChatColor.RED + "--=-=--");

                    }
                }
            }
        }

        return false;
    }
}
