package com.allen.GameTheory;

public class GameTheory {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Player player1 = new Player(20);
        Player player2 = new Player(20);

        // Implementing the strategy
        for (int i = 0; i < 5; i++) { // Example loop for 3 rounds
            player2.getAttacked(); // Player1 attacks Player2

            if (player2.getAttackCounter() % 3 == 0) {
                player1.getAttacked();
                player1.attack();// Player2 taken 1 point on the third attack
            }else {player1.attack(); // Player2 taken 1 point for attacking
            
            }
        
        }
        System.out.println("player1: " + player1.getPoints());
        System.out.println("player2: " + player2.getPoints());
        System.out.println("attackcounter1: " + player1.getAttackCounter());
        System.out.println("attackcounter2: " + player2.getAttackCounter());
    }}
       
