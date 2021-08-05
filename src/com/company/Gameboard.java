package com.company;

import java.util.Scanner;

public class Gameboard {
    public String[][] position = new String[6][];

    public Gameboard() {
        for (int i = 0; i < position.length; i++) {
            String[] rows = new String[7];
            for (int j = 0; j < 7; j++) {
                rows[j] = "_";
            }
            position[i] = rows;
        }
    }

    public String toString() {
        StringBuilder gameBoard = new StringBuilder();
        String top = "        _______________\n";
        String rowStart = "        |";
        String rowEnd = "|\n";
        String bottom = "        |1|2|3|4|5|6|7|";

        gameBoard.append(top);
        for (int i = 0; i < position.length; i++) {
            gameBoard.append(rowStart);
            for (int j = 0; j < position[i].length; j++) {
                gameBoard.append(position[i][j]);
                if (j < position[i].length - 1) {
                    gameBoard.append("|");
                }
            }
            gameBoard.append(rowEnd);
        }
        gameBoard.append(bottom);
        String output = gameBoard.toString();

        return output;
    }
}
