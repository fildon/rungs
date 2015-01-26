package com.softwire.rungs.models;

import java.io.Serializable;

public class Game implements Serializable {
    private final String player1;
    private final String player2;
    private final int player1Score;
    private final int player2Score;

    public Game(String player1, String player2, int player1Score, int player2Score) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }
}
