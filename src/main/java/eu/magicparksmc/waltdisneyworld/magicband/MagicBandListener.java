package eu.magicparksmc.waltdisneyworld.magicband;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MagicBandListener implements Listener {
    @SuppressWarnings("deprecation")
	@EventHandler
    public void InventoryClickEvent(InventoryClickEvent e) {
        if (e.getClickedInventory().getTitle().equalsIgnoreCase("magicband")) {
                if (e.isRightClick() || e.isLeftClick()) {
                    e.setCancelled(true);
                }
        }
    }

}