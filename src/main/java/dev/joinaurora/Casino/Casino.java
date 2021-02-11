package dev.joinaurora.Casino;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getServer;

public class Casino extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CommandListener(), this);
        getLogger().info("Aurora Casino plugin has loaded.");
    }
    @Override
    public void onDisable() {

    }

}
