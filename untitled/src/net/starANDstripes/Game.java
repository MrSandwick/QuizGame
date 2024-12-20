package net.starANDstripes;

import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private Quiz quiz;

    public Game() {
        scanner = new Scanner(System.in);
        quiz = new Quiz();
    }

    // Method to run the game
    public void run() {
        while (true) {
            int score = quiz.start(scanner); // Call the quiz method

            System.out.println("Your score: " + score + "/5");

            // Check if the user wants to play again
            if (!playAgain()) {
                break; // Exit the loop if the user doesn't want to play again
            }
        }
        scanner.close(); // Close the scanner
        System.out.println("Thank you for playing!");
    }

    // Method to check if the user wants to play again
    private boolean playAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String choiceInp = scanner.nextLine();
        return choiceInp.equalsIgnoreCase("yes"); // Return true if the user wants to play again
    }
}