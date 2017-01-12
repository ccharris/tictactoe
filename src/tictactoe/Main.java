package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("What is your name, player?");
		Scanner userIn = new Scanner(System.in);
		String name = userIn.nextLine();
		while (true) {
			Board newBoard = new Board();
			newBoard.initializeBoard();

			boolean gameOver = false;
			int gameCounter = 9;
			boolean userWin = false;
			boolean userLost = false;
			String userChoice;

			System.out.println("Welcome " + name);
			while (true) {
				System.out.println("Would you like to be 'o' or 'x'?");
				String userChoicPut = userIn.nextLine();
				if (userChoicPut.contains("x") || userChoicPut.contains("o")) {
					userChoice = userChoicPut;
					break;
				} else {
					System.out.println("Please enter x or o.");
				}
			}

			System.out.println("Okay, " + name + " you are " + userChoice + "!");
			while (!gameOver) {
				System.out.println("Which square would you like to move to, " + name + "?");
				newBoard.printBoard();

				try {
					Scanner ticTacChoice = new Scanner(System.in);
					int choice = ticTacChoice.nextInt();

					if ((choice > 9) || (choice < 1)) {
						System.out.println("Please enter 1 through 9");
					} else if (newBoard.choicesMade.contains(choice)) {
						System.out.println("You cannot choose that spot!");
					} else if (userChoice.toLowerCase().contains("x")) {
						newBoard.chooseSpotX(choice);
						newBoard.choicesMade.add(choice);
						if (newBoard.calculateXWin()) {
							userWin = true;
							gameOver = true;
						}
						gameCounter--;
						newBoard.compTurnO();
						if (newBoard.calculateOWin()) {
							userLost = true;
							gameOver = true;
						}
						gameCounter--;
					} else if (userChoice.toLowerCase().contains("o")) {
						newBoard.chooseSpotO(choice);
						newBoard.choicesMade.add(choice);
						if (newBoard.calculateOWin()) {
							userWin = true;
							gameOver = true;
						}
						gameCounter--;
						newBoard.compTurnX();
						if (newBoard.calculateXWin()) {
							userLost = true;
							gameOver = true;
						}
					} else {
					}
				} catch (InputMismatchException e) {
					System.out.println("Command was not recognized; " + "please enter a valid number.");
				}

				if (gameCounter == 0) {
					gameOver = true;
				}

			}
			if (userWin) {
				newBoard.printBoard();
				System.out.println("Congrats, " + name + " you won!");
			} else if (userLost) {
				newBoard.printBoard();
				System.out.println("Sorry, " + name + " you lost!");
			} else {
				newBoard.printBoard();
				System.out.println("No one won!");
			}
			System.out.println("The game is over! Thanks for playing, " + name + "!");

			System.out.println("Would you like to play again? Enter 'y' or 'n'");
			String againAnswer;
			while (true) {
				againAnswer = userIn.nextLine();
				if ((againAnswer.contains("n") || (againAnswer.contains("y")))) {
					break;
				} else {
					System.out.println("Please enter y or n");
				}
			}
			if (againAnswer.contains("n")) {
				System.out.println("Okay, goodbye!");
				break;
			} else if (againAnswer.contains("y")) {
				System.out.println("Okay, let's play again!");
			}
		}
	}
}
