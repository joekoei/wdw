package nl.joekoei.CorePlugin;

import nl.joekoei.control.*;
import nl.joekoei.magicband.*;
import nl.joekoei.ridecounter.*;
import nl.joekoei.tomorrowland.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    private static Core instance;

    private static RidecounterConfig ridecounterConfig;


    public static Core getInstance() {
        return instance;
    }

    public static RidecounterConfig getRidecounterConfig() {
        return ridecounterConfig;
    }

    @Override
    public void onEnable() {
        instance = this;
        ridecounterConfig = new RidecounterConfig();
        Commands();
        Events();
        attractions();
    }

    private void Commands() {
        this.getCommand("ridecounter").setExecutor(new RideCounterCommand());
        this.getCommand("magicband").setExecutor(new magicbandCommand());
        this.getCommand("control").setExecutor(new controlCommand());
    }

    private void attractions() {
        this.getCommand("spacemountain").setExecutor(new spaceCommand());
    }

    private void Events() {
        Bukkit.getPluginManager().registerEvents(new magicbandListener(), this);
    }

    @Override
    public void onDisable() {
        ridecounterConfig.save();
    }
}
