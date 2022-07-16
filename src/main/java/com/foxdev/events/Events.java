package com.foxdev.events;

import org.bukkit.plugin.java.JavaPlugin;

public final class Events extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("events").setExecutor(new EventGui());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
