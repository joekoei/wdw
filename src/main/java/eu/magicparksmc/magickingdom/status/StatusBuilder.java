package eu.magicparksmc.magickingdom.status;

import org.bukkit.ChatColor;

public class StatusBuilder {

    private String opened;
    private String closed;
    private String maintenance;

    public StatusBuilder() {
        opened = ChatColor.GREEN + "Opened";
        closed = ChatColor.RED + "Closed";
        maintenance = ChatColor.GOLD + "Maintenance";
    }

    public String getOpened() {
        return opened;
    }

    public String getClosed() {
        return closed;
    }

    public String getMaintenance() {
        return maintenance;
    }
}
