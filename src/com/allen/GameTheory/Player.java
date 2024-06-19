package com.allen.GameTheory;

public class Player {
	//start with 20 points
	
	private int points;
	

	//function1 attack: 
	//function2 gets attacked: lose point -> attack/wait/nothing
	public Player(int points) {
        this.points = points;
        
    }
	public void getAttacked() {
		points -= 1;
	}
	
	public int getPoints() {
		return points;
	}

}
