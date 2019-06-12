package eu.magicparksmc.magickingdom.tomorrowland;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SpaceMountainBuilder {

    private Inventory menu;

    public SpaceMountainBuilder() {
        menu = Bukkit.createInventory(null,18,"Space Mountain");
        ItemStack i = new ItemStack(Material.RED_CONCRETE);
        menu.setItem(1, i);
    }

    public Inventory getMenu() {
        return menu;
    }
}
