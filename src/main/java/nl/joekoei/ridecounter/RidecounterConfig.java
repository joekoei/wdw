package nl.joekoei.ridecounter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nl.joekoei.CorePlugin.Core;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class RidecounterConfig {

    private ArrayList<RideCounterElement> elements;

    public RidecounterConfig() {
        this.elements = new ArrayList<>();
        load();
    }

    public void load(){
        File directory = new File(Core.getInstance().getDataFolder(), "/data/ridecounter");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if(directory.exists()) {
            for (File file : directory.listFiles()) {
                try (FileReader reader = new FileReader(file)) {
                    RideCounterElement el = gson.fromJson(reader, RideCounterElement.class);
                    if(!exist(el)){
                        elements.add(el);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        for (Player player : Bukkit.getOnlinePlayers()) {
            RideCounterElement el = new RideCounterElement(player.getUniqueId());
            if(!exist(el)){
                elements.add(el);
            }
        }
    }

    private boolean exist(RideCounterElement el) {
        boolean found = false;
        for (RideCounterElement element : this.elements) {
            if(element.getUUID().equals(el.getUUID())){
                found = true;
            }
        }
        return found;
    }

    public void save(){
        for (RideCounterElement element : this.elements) {
            element.save();
        }
    }

    public RideCounterElement getByPlayer(Player tofind) {
        RideCounterElement result = null;
        for (RideCounterElement rideCounterElement : this.elements) {
            if(rideCounterElement.getUUID().equals(tofind.getUniqueId())){
                result = rideCounterElement;
            }
        }
        return result;
    }

    public RideCounterElement getByUUID(UUID tofind) {
        RideCounterElement result = null;
        for (RideCounterElement rideCounterElement : this.elements) {
            if(rideCounterElement.getUUID().equals(tofind)){
                result = rideCounterElement;
            }
        }
        return result;
    }

    public ArrayList<RideCounterElement> getElements() {
        return elements;
    }
}