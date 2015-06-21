package com.criliscraft.bowbrawl.game;

import com.criliscraft.bowbrawl.BowBrawl;
import com.criliscraft.bowbrawl.game.arena.*;
import com.criliscraft.bowbrawl.game.gamer.Gamer;
import com.criliscraft.bowbrawl.game.sign.GameSign;
import com.criliscraft.bowbrawl.game.task.GameSignTask;
import com.criliscraft.bowbrawl.game.task.GameTask;
import com.criliscraft.bowbrawl.game.task.GameTickTask;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class Game {

    private String name;
    private Arena arena;
    private Lobby lobby;
    private GameRules rules;

    private Map<UUID, Gamer> gamers = new HashMap<UUID, Gamer>();

    private List<GameSign> signs = new ArrayList<GameSign>();

    private GameTask gameTickTask = new GameTickTask();
    private GameTask gameSignTask = new GameSignTask();

    public Game(String name, Location c1, Location c2) {
        this(name);
        this.arena = new Arena(c1, c2);
    }

    public Game(String name) {
        this.name = name;
        this.startSignsTask();
        rules = new GameRules();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<UUID, Gamer> getGamers() {
        return gamers;
    }

    public void addGamer(Gamer gamer) {
        gamers.put(gamer.getUuid(), gamer);
        gamer.cleanPlayer();
        gamer.teleport(lobby.getRandomTeleportLocation());
    }

    public void removePlayer(Gamer gamer) {
        gamer.cleanPlayer();
        //TODO Send them to the hub
        gamers.remove(gamer);
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public List<GameSign> getSigns() {
        return signs;
    }

    public void addGameSign(GameSign sign) {
        signs.add(sign);
    }

    private void startSignsTask() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(BowBrawl.getInstance(), gameSignTask, 20L, 10L);
    }

    private void startGameTask() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(BowBrawl.getInstance(), gameTickTask, 20L, 20L);
    }

    public Lobby getLobby() {
        return lobby;
    }

    public void setLobby(Lobby lobby) {
        this.lobby = lobby;
    }

    public void broadcastMessage(String message) {
        for (Gamer g : gamers.values()) {
            g.sendMessage(message);
        }
    }
}
