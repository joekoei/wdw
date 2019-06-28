package eu.magicparksmc.waltdisneyworld.fastpass;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class FastpassListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractAtEntityEvent e) {
        Bukkit.broadcastMessage(e.getRightClicked().getCustomName());
        Entity entity = e.getRightClicked();
        if(entity.getType().equals(EntityType.ARMOR_STAND)) {
            if (entity.getName().equalsIgnoreCase("fastpass_machine")) {
                if (e.getHand().equals(Material.PAPER)) {
                    Bukkit.broadcastMessage("Fastpass Machine at: " + e.getRightClicked().getLocation().toString() + e.getRightClicked().equals(Material.PAPER));
                }
            }
        }
    }
}
