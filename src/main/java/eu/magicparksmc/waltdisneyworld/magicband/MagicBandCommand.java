package eu.magicparksmc.waltdisneyworld.magicband;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MagicBandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("magicband")) {
            if (args.length == 0) {
                MagicBandBuilder m = new MagicBandBuilder();
                Player player = (Player) sender;
                player.openInventory(m.getMenu());
            }
        }
        return false;
    }
}
