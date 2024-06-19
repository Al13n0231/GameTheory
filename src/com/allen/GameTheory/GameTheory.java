package com.allen.GameTheory;

public class GameTheory { 
	public static void main(String[] args) {
		System.out.println("Hello world");
		Player player1 = new Player(20);
		Player player2 = new Player(20);
		player1.getAttacked();
		if (player1.getPoints() < 20){
			player2.getAttacked();
			
		}
		System.out.println("player1: " + player1.getPoints());
		System.out.println("player2: " + player2.getPoints());
	}
		
	
}
