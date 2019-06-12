package nl.joekoei.control;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class controlBuilder {

    private Inventory menu;
    private Inventory m;

    public controlBuilder() {
        menu = Bukkit.createInventory(null, 18, "Control Panels");
    }

    public Inventory getMenu(){
        return menu;
    }
}
