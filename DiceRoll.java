package com.bridgelabz.snakeladder;

public class DiceRoll {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And Ladder Problem. ");
		System.out.println("Player rolls the die and get a number: " + dieThrow());

	}

	public static int dieThrow() {
		int num = (int) (Math.random() * 6) + 1;
		return num;
	}

}
