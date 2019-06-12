package nl.joekoei.tomorrowland;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class spaceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("spacemountain")) {
            if (sender.hasPermission("mw")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "You need to give arguments");
                } else if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("power")) {
                        Bukkit.broadcastMessage(args[0]);
                        spaceBuilder m = new spaceBuilder();
                        if (m.getMenu().getItem(1).equals(Material.RED_CONCRETE)) {
                            ArrayList lore = new ArrayList();
                            lore.add("ON");
                            m.getMenu().getItem(1).setType(Material.GREEN_CONCRETE);
                            m.getMenu().getItem(1).getItemMeta().setLore(lore);
                        } else if (m.getMenu().getItem(1).equals(Material.GREEN_CONCRETE)) {
                            ArrayList lore = new ArrayList();
                            lore.add("OFF");
                            m.getMenu().getItem(1).setType(Material.RED_CONCRETE);
                            m.getMenu().getItem(1).getItemMeta().setLore(lore);
                        }
                    }
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You cant do this!");
            }
        }


        return false;
    }
}
