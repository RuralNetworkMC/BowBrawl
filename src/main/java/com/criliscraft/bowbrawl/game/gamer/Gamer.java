package com.criliscraft.bowbrawl.game.gamer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

import java.util.UUID;

public class Gamer {

    private UUID uuid;

    public Gamer(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void sendMessage(String message) {
        getPlayer().sendMessage(ChatColor.GREEN + message);
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(uuid);
    }

    public void cleanPlayer() {
        getPlayer().getInventory().setArmorContents(null);
        getPlayer().getInventory().clear();
        clearEffects();
        heal();
    }

    public void clearEffects() {
        for (PotionEffect effect : getPlayer().getActivePotionEffects()) {
            getPlayer().removePotionEffect(effect.getType());
        }
    }

    public void heal() {
        getPlayer().setHealth(20);
        getPlayer().setFoodLevel(20);
    }

    public boolean isSneaking() {
        return getPlayer().isSneaking();
    }

    public boolean isSprinting() {
        return getPlayer().isSprinting();
    }

    public GameMode getGameMode() {
        return  getPlayer().getGameMode();
    }

    public void setGameMode(GameMode gameMode) {
        getPlayer().setGameMode(gameMode);
    }

    public Location getLocation() {
        return getPlayer().getLocation();
    }

    public boolean teleport(Location location) {
        return getPlayer().teleport(location);
    }
}
