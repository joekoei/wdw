package eu.magicparksmc.magickingdom.fantasyland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class BarnstormerBuilder {

    private Inventory menu;

    public BarnstormerBuilder() {
        menu = Bukkit.createInventory(null, 18, "The Barnstormer");
    }

    public Inventory getMenu() {
        return menu;
    }
}
