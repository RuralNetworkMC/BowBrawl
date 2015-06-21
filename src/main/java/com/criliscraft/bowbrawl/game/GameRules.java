package com.criliscraft.bowbrawl.game;

import java.util.HashMap;
import java.util.Map;

public class GameRules {

    private boolean allowBlockBreak;
    private boolean allowBlockPlace;
    private boolean allowExternalCommands;
    private boolean allowChat;
    private boolean allowDrop;
    private boolean allowPickup;
    private boolean allowPvPinLobby;
    private boolean allowLeaveArena;
    private boolean allowLeaveLobby;

    public boolean isAllowBlockBreak() {
        return allowBlockBreak;
    }

    public void setAllowBlockBreak(boolean allowBlockBreak) {
        this.allowBlockBreak = allowBlockBreak;
    }

    public boolean isAllowBlockPlace() {
        return allowBlockPlace;
    }

    public void setAllowBlockPlace(boolean allowBlockPlace) {
        this.allowBlockPlace = allowBlockPlace;
    }

    public boolean isAllowExternalCommands() {
        return allowExternalCommands;
    }

    public void setAllowExternalCommands(boolean allowExternalCommands) {
        this.allowExternalCommands = allowExternalCommands;
    }

    public boolean isAllowChat() {
        return allowChat;
    }

    public void setAllowChat(boolean allowChat) {
        this.allowChat = allowChat;
    }

    public boolean isAllowDrop() {
        return allowDrop;
    }

    public void setAllowDrop(boolean allowDrop) {
        this.allowDrop = allowDrop;
    }

    public boolean isAllowPickup() {
        return allowPickup;
    }

    public void setAllowPickup(boolean allowPickup) {
        this.allowPickup = allowPickup;
    }

    public boolean isAllowPvPinLobby() {
        return allowPvPinLobby;
    }

    public void setAllowPvPinLobby(boolean allowPvPinLobby) {
        this.allowPvPinLobby = allowPvPinLobby;
    }

    public boolean isAllowLeaveArena() {
        return allowLeaveArena;
    }

    public void setAllowLeaveArena(boolean allowLeaveArena) {
        this.allowLeaveArena = allowLeaveArena;
    }

    public boolean isAllowLeaveLobby() {
        return allowLeaveLobby;
    }

    public void setAllowLeaveLobby(boolean allowLeaveLobby) {
        this.allowLeaveLobby = allowLeaveLobby;
    }

    public Map<String, Boolean> toMap() {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("allowBlockBreak", allowBlockBreak);
        map.put("allowBlockPlace", allowBlockPlace);
        map.put("allowExternalCommands", allowExternalCommands);
        map.put("allowChat", allowChat);
        map.put("allowDrop", allowDrop);
        map.put("allowPickup", allowPickup);
        map.put("allowPvPinLobby", allowPvPinLobby);
        map.put("allowLeaveArena", allowLeaveArena);
        map.put("allowLeaveLobby", allowLeaveLobby);
        return map;
    }
}
