package dev.joinaurora.Casino;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getLogger;

public class CommandListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        getLogger().info(event.getPlayer().getName() + "has joined the server. ");
    }

}
