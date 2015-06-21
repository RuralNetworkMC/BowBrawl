package com.criliscraft.bowbrawl.game.sign;

import org.bukkit.block.Sign;

public abstract class GameSign {

    private Sign sign;

    public GameSign(Sign sign) {
        this.sign = sign;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }
}
