package eu.magicparksmc.magickingdom.frontierland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class SplashMountainBuilder {

    private Inventory menu;

    public SplashMountainBuilder() {
        menu = Bukkit.createInventory(null,18,"Splash Mountain");
    }

    public Inventory getMenu() {
        return menu;
    }
}
