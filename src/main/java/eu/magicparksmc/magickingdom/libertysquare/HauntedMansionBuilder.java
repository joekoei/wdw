package eu.magicparksmc.magickingdom.libertysquare;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class HauntedMansionBuilder {

    private Inventory menu;

    public HauntedMansionBuilder() {
        menu = Bukkit.createInventory(null, 18, "Haunted Mansion");
    }

    public Inventory getMenu() {
        return menu;
    }
}
