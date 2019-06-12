package nl.joekoei.frontierland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class btmBuilder {

    private Inventory menu;

    public btmBuilder() {
        menu = Bukkit.createInventory(null, 18, "Big Thunder Mountain Railroad");
    }


    public Inventory getMenu() {
        return menu;
    }
}
