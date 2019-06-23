package nl.joekoei.ridecounter;

import nl.joekoei.core.Core;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class infoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("ride")) {
            if (args.length == 1) {}
                RideCounterElement element = Core.getRidecounterConfig().getByPlayer(Bukkit.getPlayer(args[0]));
                Bukkit.broadcastMessage(element.getData() + "");
        }


        return false;
    }
}
