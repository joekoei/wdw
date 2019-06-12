package eu.magicparksmc.waltdisneyworld.magicband;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MagicBandBuilder {

    private Inventory menu;

    public MagicBandBuilder() {
        menu = Bukkit.createInventory(null, 9, "MagicBand");
        ItemStack i = new ItemStack(Material.GREEN_CONCRETE, 1);
        i.getItemMeta().setDisplayName("Magic Band");
        menu.setItem(3, i);
    }

    public Inventory getMenu() {
        return menu;
    }
}
