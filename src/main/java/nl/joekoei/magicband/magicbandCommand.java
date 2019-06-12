package nl.joekoei.magicband;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class magicbandCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("magicband")) {
            if (args.length == 0) {
                magicbandBuilder m = new magicbandBuilder();
                Player player = (Player) sender;
                player.openInventory(m.getMenu());
            } else if (args.length == 1) {
                magicbandBuilder m = new magicbandBuilder();
                m.getMenu().getItem(3).setAmount(3);
                }
            }
        return false;
    }
}
