package nl.joekoei.tomorrowland;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class spaceBuilder {

    private Inventory menu;

    public spaceBuilder() {
        menu = Bukkit.createInventory(null,18,"Space Mountain");
        ItemStack i = new ItemStack(Material.RED_CONCRETE);
        menu.setItem(1, i);
    }

    public Inventory getMenu() {
        return menu;
    }
}
