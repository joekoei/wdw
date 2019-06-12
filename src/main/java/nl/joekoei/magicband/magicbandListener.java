package nl.joekoei.magicband;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class magicbandListener implements Listener {

    @EventHandler
    public void InventoryClickEvent(InventoryClickEvent e) {
        if (e.getClickedInventory().getTitle().equalsIgnoreCase("magicband")) {
                if (e.isRightClick() || e.isLeftClick()) {
                    e.setCancelled(true);
                }
        }
    }

}
