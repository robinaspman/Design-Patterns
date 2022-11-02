package com.example.lib;

import com.example.lib.controller.ScoreBoard;
import com.example.lib.model.Balloon;
import com.example.lib.model.Clown;
import com.example.lib.model.SquareBalloon;

public class StrategyDesignPattern {
    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.print("Balloon Tap Score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print(" Clown Tap Score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}