package eu.magicparksmc.magickingdom.libertysquare;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class LibertySquareRiverboatBuilder {

    private Inventory menu;

    private String title;

    public LibertySquareRiverboatBuilder() {
        menu = Bukkit.createInventory(null,18,"Liberty Square Riverboat");
        title = "LibertySquareRiverboat";
    }

    public Inventory getMenu() {
        return menu;
    }


    public String getTitle() {
        return title;
    }
}
