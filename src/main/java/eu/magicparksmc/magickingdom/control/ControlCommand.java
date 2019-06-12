package eu.magicparksmc.magickingdom.control;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import eu.magicparksmc.magickingdom.adventureland.*;
import eu.magicparksmc.magickingdom.attractions.*;
import eu.magicparksmc.magickingdom.fantasyland.*;
import eu.magicparksmc.magickingdom.frontierland.*;
import eu.magicparksmc.magickingdom.libertysquare.*;
import eu.magicparksmc.magickingdom.tomorrowland.*;

public class ControlCommand implements CommandExecutor
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
                        RailroadBuilder m = new RailroadBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("btm")) {
                        BigThunderMountainBuilder m = new BigThunderMountainBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("hm")) {
                        HauntedMansionBuilder m = new HauntedMansionBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("space")) {
                        SpaceMountainBuilder m = new SpaceMountainBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("splash")) {
                        SplashMountainBuilder m = new SplashMountainBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("barn")){
                        BarnstormerBuilder m = new BarnstormerBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());

                    } else if (args[0].equalsIgnoreCase("mcoa")){
                        MagicCarpetsBuilder m = new MagicCarpetsBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());


                    } else if (args[0].equalsIgnoreCase("help")) {
                        sender.sendMessage(ChatColor.RED + "--=-=--");
                        sender.sendMessage("");
                        sender.sendMessage("Control Panels" + ChatColor.GREEN + " Available");
                        sender.sendMessage("btm, hm, space, splash, parktrain, barn, mcoa");
                        sender.sendMessage("");
                        sender.sendMessage(ChatColor.RED + "--=-=--");

                    } else if (args[0].equalsIgnoreCase("panels")) {
                        ControlPanelBuilder m = new ControlPanelBuilder();
                        Player player = (Player) sender;
                        player.openInventory(m.getMenu());
                    }
                }
            }
        }

        return false;
    }
}
