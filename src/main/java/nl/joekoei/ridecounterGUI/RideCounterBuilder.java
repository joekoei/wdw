package nl.joekoei.ridecounterGUI;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class RideCounterBuilder {

    private Inventory menu;

    public RideCounterBuilder() {
        menu = Bukkit.createInventory(null,9,"Ridecounter!");
    }

    public Inventory getMenu() {
        return menu;
    }
}
