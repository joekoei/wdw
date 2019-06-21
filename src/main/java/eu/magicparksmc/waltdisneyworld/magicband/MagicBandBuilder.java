package eu.magicparksmc.waltdisneyworld.magicband;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MagicBandBuilder {

    private Inventory menu;

    public MagicBandBuilder() {
        menu = Bukkit.createInventory(null, 9, "Magic Band");
        final ItemStack i = new ItemStack(Material.TRIPWIRE_HOOK, 1);
        final ItemMeta m = i.getItemMeta();
        m.setDisplayName("Regions");
        i.setItemMeta(m);

        menu.setItem(0, i);
    }

    public Inventory getMenu() {
        return menu;
    }
}
