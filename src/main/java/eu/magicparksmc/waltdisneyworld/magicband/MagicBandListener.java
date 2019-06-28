package eu.magicparksmc.waltdisneyworld.magicband;

import eu.magicparksmc.waltdisneyworld.regions.RegionsBuilder;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MagicBandListener implements Listener {
	@SuppressWarnings("deprecation")
	@EventHandler
	public void InventoryClickEvent(InventoryClickEvent e) {
		if (e.getClickedInventory().getTitle().equalsIgnoreCase("magic band")) {
			if (e.isRightClick() || e.isLeftClick()) {
				e.setCancelled(true);
				if (e.getCurrentItem().getType().equals(Material.TRIPWIRE_HOOK)) {
					RegionsBuilder m = new RegionsBuilder();
					e.getWhoClicked().closeInventory();
					e.getWhoClicked().openInventory(m.getMenu());
				}
			}
		}
		if (e.getClickedInventory().getTitle().equalsIgnoreCase("Regions Magic Kingdom")) {
			if (e.isRightClick() || e.isLeftClick()) {
				e.setCancelled(true);
			}
		}

	}
}