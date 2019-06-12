package nl.joekoei.ridecounter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nl.joekoei.CorePlugin.Core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

public class RideCounterElement {
    private UUID uuid;
    private HashMap<String, Integer> data = new HashMap<>();

    public RideCounterElement(UUID uuid){
        this.uuid = uuid;
    }

    public void save(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this);
        File directory = new File(Core.getInstance().getDataFolder(), "/data/ridecounter");
        if(!directory.exists()){
            directory.mkdirs();
        }
        File file = new File(directory, uuid.toString() + ".json");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(FileWriter writer = new FileWriter(file)){
            writer.write(json);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public RideCounterElement(){}

    public RideCounterElement(UUID uuid, HashMap<String, Integer> data){
        this.uuid = uuid;
        this.data = data;
    }

    public UUID getUUID(){
        return this.uuid;
    }

    public HashMap<String, Integer> getData(){
        return this.data;
    }
    public Integer getRideCount(String key){
        return getData().get(key);
    }
    public void count(String ride){
        if(getRideCount(ride)!=null){
            int count = getRideCount(ride);
            count++;
            data.put(ride,count);
            Core.getRidecounterConfig().save();
        } else {
            int count = 1;
            data.put(ride,count);
            Core.getRidecounterConfig().save();
        }
    }

}