package com.criliscraft.bowbrawl;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class BowBrawl extends JavaPlugin {

    private static BowBrawl instance;

    public static BowBrawl getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {

        this.getLogger().log(Level.INFO, "Disabled");
    }

    @Override
    public void onEnable() {

        this.getLogger().log(Level.INFO, "Enabled");
    }
}
