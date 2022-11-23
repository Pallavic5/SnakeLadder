package com.bridgelabz.snakeladder;

/*
 * UC - 3 The Player then checks for a Option. They are No Play,Ladder or Snake.
 */
public class CheckOption {

	public static void main(String[] args) {
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;

		int playerStartPosition = 0;
		System.out.println("Player Position = " + playerStartPosition);

		int playerRollDice = (int) (Math.random() * 6) + 1;
		System.out.println("Player get a dice number: " + playerRollDice);

		int optionCheck = (int) (Math.random() * 100) % 3;
		System.out.println("Optioncheck: " + optionCheck);

		if (optionCheck == LADDER) {
			System.out.println("Ladder");
			playerStartPosition = playerStartPosition + playerRollDice;
			System.out.println("Player moves ahead by the: " + playerStartPosition);

		} else if (optionCheck == SNAKE) {
			System.out.println("Snake");
			playerStartPosition = playerStartPosition - playerRollDice;
			System.out.println("Player moves behind by the: " + playerStartPosition);
		} else {

			System.out.println("No Play,the Player stays in the same position");
		}

		if (playerStartPosition < 0)
			playerStartPosition = 0;
		System.out.println("PlayerPosition: " + playerStartPosition);

	}

}
