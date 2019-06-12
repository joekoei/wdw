package nl.joekoei.adventureland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class magiccarpetsBuilder {

    private Inventory menu;

    public magiccarpetsBuilder() {
        menu = Bukkit.createInventory(null,18,"The Magic Carpets of Aladin");
    }

    public Inventory getMenu() {
        return menu;
    }
}
