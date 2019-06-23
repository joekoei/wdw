package eu.magicparksmc.status;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class statusListener implements Listener {

    public String spacestatus;

    @EventHandler
    public void InventoryClickEvent(InventoryClickEvent e) {

        if (e.getClickedInventory().getTitle().equalsIgnoreCase("Status Control Space Mountain")) {
            if(e.isLeftClick() || e.isRightClick());
                e.setCancelled(true);
                if (e.getCurrentItem().getType().equals(Material.GREEN_CONCRETE)) {
                    e.getWhoClicked().sendMessage(ChatColor.GRAY + "Operator " + e.getWhoClicked().getName() + " just opened " + ChatColor.RED + "Space Mountain" );
                    spacestatus = ChatColor.GREEN + "Opened";
                    Bukkit.broadcastMessage(spacestatus);
                    e.getWhoClicked().closeInventory();
                } else if (e.getCurrentItem().getType().equals(Material.RED_CONCRETE)) {
                    e.getWhoClicked().sendMessage(ChatColor.GRAY + "Operator " + e.getWhoClicked().getName() + " just closed " + ChatColor.RED + "Space Mountain" );
                    spacestatus = ChatColor.RED + "Closed";
                    e.getWhoClicked().closeInventory();
                } else if (e.getCurrentItem().getType().equals(Material.YELLOW_CONCRETE)) {
                    e.getWhoClicked().sendMessage(ChatColor.GRAY + "Operator " + e.getWhoClicked().getName() + " just set maintenance on " + ChatColor.RED + "Space Mountain");
                    spacestatus = ChatColor.GOLD + "Maintenance";
                    e.getWhoClicked().closeInventory();
                }
        }


    }

    public String getSpacestatus() {
        return spacestatus;
    }
}
