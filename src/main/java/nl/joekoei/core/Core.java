package nl.joekoei.core;

import nl.joekoei.ridecounter.*;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import eu.magicparksmc.magickingdom.control.*;
import eu.magicparksmc.magickingdom.tomorrowland.*;
import eu.magicparksmc.waltdisneyworld.magicband.*;

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
        this.getCommand("magicband").setExecutor(new MagicBandCommand());
        this.getCommand("control").setExecutor(new ControlCommand());
        this.getCommand("ride").setExecutor(new infoCommand());
    }

    private void attractions() {
        this.getCommand("spacemountain").setExecutor(new SpaceMountainCommand());
    }

    private void Events() {
        Bukkit.getPluginManager().registerEvents(new MagicBandListener(), this);
        Bukkit.getPluginManager().registerEvents(new SpaceMountainListener(), this);
    }

    @Override
    public void onDisable() {
        ridecounterConfig.save();
    }
}