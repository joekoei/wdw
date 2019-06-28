package nl.joekoei.ridecounterGUI;

import nl.joekoei.core.Core;
import nl.joekoei.ridecounter.RideCounterElement;
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

import java.util.ArrayList;

public class RideCounterGUICommand implements CommandExecutor {
    @Override
    public boolean onCommand( CommandSender sender,  Command command,  String label, String[] args) {
        if (command.getName().equalsIgnoreCase("ridecountermenu")) {
            if(args.length == 1) {
                if (args[0].equalsIgnoreCase("tomorrowland")) {
                    Player player = (Player) sender;
                    final Inventory menu = Bukkit.createInventory(player, 27, "Tomorrowland Rides");
                    RideCounterElement element = Core.getRidecounterConfig().getByPlayer(Bukkit.getPlayer(player.getUniqueId()));


                    // Space Mountain //
                    ItemStack spacem = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta spacemeta = spacem.getItemMeta();
                    ArrayList space = new ArrayList();
                    space.add(ChatColor.GRAY + "Total Rides: " + element.getData().get("space_mountain") + "");
                    spacemeta.setDisplayName(ChatColor.GOLD + "Spacemountain");
                    spacemeta.setLore(space);
                    spacem.setItemMeta(spacemeta);

                    // People Mover //
                    ItemStack pm = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta pmm = pm.getItemMeta();
                    ArrayList pma = new ArrayList();
                    pma.add(ChatColor.GRAY + "Total Rides: " + element.getData().get("people_mover") + "");
                    pmm.setDisplayName(ChatColor.GOLD + "People Mover");
                    pmm.setLore(pma);
                    pm.setItemMeta(pmm);


                    menu.setItem(10, spacem);
                    menu.setItem(12, pm);

                    player.openInventory(menu);

                } else if (args[0].equalsIgnoreCase("frontierland")) {
                    Player player = (Player) sender;
                    final Inventory frontier_land = Bukkit.createInventory(player,27,"Frontier Land");
                    RideCounterElement element = Core.getRidecounterConfig().getByPlayer(Bukkit.getPlayer(player.getUniqueId()));

                    // Big Thunder Mountain //
                    ItemStack btm = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta metabtm = btm.getItemMeta();
                    ArrayList btmride = new ArrayList();
                    btmride.add(ChatColor.GRAY + "Total Rides: " + element.getData().get("big_thunder_mountain"));
                    metabtm.setDisplayName(ChatColor.GOLD + "Big Thunder Mountain");
                    metabtm.setLore(btmride);
                    btm.setItemMeta(metabtm);

                    frontier_land.setItem(10,btm);

                    player.openInventory(frontier_land);

                }
            } else if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Frontierland, Tomorrowland");
            }
        }

        return false;
    }
}
