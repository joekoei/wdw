package nl.joekoei.libertysquare;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class hauntedBuilder {

    private Inventory menu;

    public hauntedBuilder() {
        menu = Bukkit.createInventory(null, 18, "Haunted Mansion");
    }

    public Inventory getMenu() {
        return menu;
    }
}
