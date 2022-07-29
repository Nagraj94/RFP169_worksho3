package com.bridgelabz;

public class Players {
    String playerName;

    public Players(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        System.out.println("Player Name " + playerName);
        return "Player Name " + playerName ;
    }
}
