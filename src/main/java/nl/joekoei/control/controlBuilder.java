package nl.joekoei.control;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class controlBuilder {

    private Inventory menu;

    public controlBuilder() {
        menu = Bukkit.createInventory(null, 18, "Control Panels");
        ItemStack i = new ItemStack(Material.ACACIA_BOAT);
        ArrayList lore = new ArrayList();
        lore.add("Splash Mountain");
        i.getItemMeta().setLore(lore);
    }

    public Inventory getMenu(){
        return menu;
    }
}
