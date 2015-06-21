package com.criliscraft.bowbrawl.game.arena;

import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lobby {

    private Location corner1;
    private Location corner2;
    private List<Location> teleportLocations;

    public Lobby(Location corner1, Location corner2) {
        this.corner1 = corner1;
        this.corner2 = corner2;
        teleportLocations = new ArrayList<Location>();
    }

    public Location getCorner1() {
        return corner1;
    }

    public void setCorner1(Location corner1) {
        this.corner1 = corner1;
    }

    public Location getCorner2() {
        return corner2;
    }

    public void setCorner2(Location corner2) {
        this.corner2 = corner2;
    }

    public void addTeleportLocation(Location location) {
        teleportLocations.add(location.clone());
    }

    public boolean removeTeleportLocation(Location location) {
        Location removeLocation = null;
        for (Location l : teleportLocations) {
            boolean x = l.getBlockX() == location.getBlockX();
            boolean y = l.getBlockY() == location.getBlockY();
            boolean z = l.getBlockZ() == location.getBlockZ();
            boolean w = l.getWorld().getName().equals(location.getWorld().getName());
            if (x && y && z && w) {
                removeLocation = l;
            }
        }
        if (removeLocation != null) {
            teleportLocations.remove(removeLocation);
            return true;
        }
        return false;
    }

    public boolean toggleTeleportLocation(Location location) {
        if (removeTeleportLocation(location)) {
            return false;
        } else {
            addTeleportLocation(location);
            return true;
        }
    }

    public Location getRandomTeleportLocation() {
        int index = new Random().nextInt(teleportLocations.size());
        Location loc = teleportLocations.get(index);
        return loc;
    }
}
