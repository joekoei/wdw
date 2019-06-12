package nl.joekoei.attractions;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class parktrainBuilder {

    private Inventory menu;

    public parktrainBuilder() {
        menu = Bukkit.createInventory(null, 9, "Park Train Control");
    }

    public Inventory getMenu() {
        return menu;
    }
}
