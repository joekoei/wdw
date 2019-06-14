package eu.magicparksmc.magickingdom.tomorrowland;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class SpaceMountainListener implements Listener {
    @SuppressWarnings("deprecation")
	@EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Inventory i = e.getClickedInventory();
        SpaceMountainBuilder m = new SpaceMountainBuilder();

        if (i.getTitle().equalsIgnoreCase("Space Mountain")) {
            if (e.isLeftClick() || e.isRightClick()) {
                e.setCancelled(true);
            }
        }
    }
}