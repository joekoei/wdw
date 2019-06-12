package eu.magicparksmc.magickingdom.adventureland;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class MagicCarpetsBuilder {
    private Inventory menu;

    public MagicCarpetsBuilder() {
        menu = Bukkit.createInventory(null,18,"The Magic Carpets of Aladin");
    }

    public Inventory getMenu() {
        return menu;
    }
}