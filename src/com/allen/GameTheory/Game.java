package com.allen.GameTheory;

public class Game {
	private Player player1;
    private Player player2;

    public Game(int player1Points, int player2Points) {
        this.player1 = new Player(player1Points);
        this.player2 = new Player(player2Points);
    }

    public void startGame(int rounds) {
        for (int i = 0; i < rounds; i++) {
            player2.getAttacked(); // Player1 attacks Player2

            if (player2.getAttackCounter() % 3 == 0) {
                player1.getAttacked();
                player1.attack(); // Player2 taken 1 point on the third attack
            } else {
                player1.attack(); // Player2 taken 1 point for attacking
            }
        }

        printResults();
    }

    private void printResults() {
        System.out.println("player1: " + player1.getPoints());
        System.out.println("player2: " + player2.getPoints());
        System.out.println("attackcounter1: " + player1.getAttackCounter());
        System.out.println("attackcounter2: " + player2.getAttackCounter());
    }

}
