package nl.joekoei.frontierland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class splashBuilder {

    private Inventory menu;

    public splashBuilder() {
        menu = Bukkit.createInventory(null,18,"Splash Mountain");
    }

    public Inventory getMenu() {
        return menu;
    }
}
