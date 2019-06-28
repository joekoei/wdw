package eu.magicparksmc.waltdisneyworld.fastpass;

import nl.joekoei.core.Core;
import nl.joekoei.ridecounter.RideCounterElement;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class FastpassCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("fastpass")) {
            if (args.length == 1 || args[0].equalsIgnoreCase("give")) {
                Player player = (Player) sender;
                RideCounterElement element = Core.getRidecounterConfig().getByPlayer(Bukkit.getPlayer(player.getUniqueId()));
                Bukkit.broadcastMessage(element.getData() + "");

                if (element.getData().get("fastpass_count") == null || element.getData().get("fastpass_count") < 3) {
                    int count = 1;
                    String fastpasscount;
                    fastpasscount = "fastpass_count";
                    element.getData().put(fastpasscount, count);
                }
            } else if (args.length == 2 || args[0].equalsIgnoreCase("make")) {
                final Player player = (Player) sender;
                for (final Entity e : player.getNearbyEntities(1.0, 1.0, 1.0)) {
                    if (e instanceof ArmorStand) {
                        final ArmorStand stand = (ArmorStand) e;
                        stand.setCustomName(args[1]);
                        stand.setCustomNameVisible(true);
                    }
                }


            }
        }
        return false;
    }
}