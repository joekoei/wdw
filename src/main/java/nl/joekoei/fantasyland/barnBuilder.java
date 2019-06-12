package nl.joekoei.fantasyland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class barnBuilder {

    private Inventory menu;

    public barnBuilder() {
        menu = Bukkit.createInventory(null, 18, "The Barnstormer");
    }

    public Inventory getMenu() {
        return menu;
    }
}
