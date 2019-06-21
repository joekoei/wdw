package eu.magicparksmc.waltdisneyworld.regions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class regionsBuilder {

    private Inventory menu;

    public regionsBuilder() {
        menu = Bukkit.createInventory(null,36,"Regions Magic Kingdom");
        final ItemStack ft = new ItemStack(Material.WOODEN_PICKAXE);
        final ItemMeta ftt = ft.getItemMeta();
        final ArrayList loreft = new ArrayList();
        loreft.add("See here all attractions in Frontier Land");
        ftt.setDisplayName(ChatColor.GRAY + "Frontier Land");
        ftt.setLore(loreft);
        ft.setItemMeta(ftt);

        menu.setItem(10,ft);

    }

    public Inventory getMenu() {
        return menu;
    }
}
