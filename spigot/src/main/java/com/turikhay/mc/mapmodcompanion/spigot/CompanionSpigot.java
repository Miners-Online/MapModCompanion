package com.turikhay.mc.mapmodcompanion.spigot;

import org.bukkit.World;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class CompanionSpigot extends JavaPlugin implements Listener {
    public static final boolean ENABLE_LOGGING = Boolean.parseBoolean(
            System.getProperty(CompanionSpigot.class.getPackage().getName() + ".debug", "false")
    );

    public static final boolean DISABLE_DEFAULT_WORLD_ID = Boolean.parseBoolean(
            System.getProperty(CompanionSpigot.class.getPackage().getName() + ".defaultId", "false")
    );

    List<Handler<?>> handlers = Arrays.asList(
            new XaerosHandler(this),
            new WorldIdHandler(this)
    );

    DefaultWorld defaultWorld;

    @Override
    public void onEnable() {
        if (DISABLE_DEFAULT_WORLD_ID) {
            getLogger().info("Plugin will not use default world ID for every world");
            defaultWorld = DefaultWorld.empty();
        } else {
            defaultWorld = DefaultWorld.detectDefaultWorld(this);
        }
        handlers.forEach(Handler::init);
    }

    Optional<World> getDefaultWorld() {
        return defaultWorld.optional();
    }
}
