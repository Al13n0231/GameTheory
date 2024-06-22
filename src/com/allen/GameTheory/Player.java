package com.allen.GameTheory;

public class Player {
    private int points;
    private int attackCounter; // Counter to track the number of attacks

    public Player(int points) {
        this.points = points;
        this.attackCounter = 0; // Initialize the attack counter
    }

    public void getAttacked() {
        points -= 1;
        attackCounter += 1; // Increment the attack counter when attacked
    }

    public void attack() {
        points -= 1; // Decrease points when attacking
    }

    public int getPoints() {
        return points;
    }

    public int getAttackCounter() {
        return attackCounter;
    }

    public void resetAttackCounter() {
        attackCounter = 0; // Reset the attack counter
    }
}
