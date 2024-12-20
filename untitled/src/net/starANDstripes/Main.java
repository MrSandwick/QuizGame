package net.starANDstripes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Endless loop for playing the game
            int score = QnA(scanner); // Call the quiz method

            System.out.println("Your score: " + score + "/5");

            // Check if the user wants to play again
            if (!playAgain(scanner)) {
                break; // Exit the loop if the user doesn't want to play again
            }
        }

        scanner.close(); // Close the scanner
        System.out.println("Thank you for playing!");
    }

    //Method to tun the quiz
    public static int QnA (Scanner scanner){
        int score = 0;
        String[] questions = new String[5];
        questions[0] = "What is 2 + 2:";
        questions[1] = "What planet is known as the Red Planet?";
        questions[2] = "What color is the sky?";
        questions[3] = "The biggest ocean?";
        questions[4] = "What is 15/5?";

        String[] ans = new String[5];
        ans[0] = "4";
        ans[1] = "Mars";
        ans[2] = "Blue";
        ans[3] = "Pacific";
        ans[4] = "3";
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String ansInput = scanner.nextLine().trim(); // Read user input

            if (ansInput.equalsIgnoreCase(ans[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + ans[i]);
            }
        }

        return score; // Return the total score
    }

    // Method to check if the user wants to play again
    public static boolean playAgain(Scanner scanner) {
        System.out.print("Do you want to play again? (yes/no): ");
        String choiceInp = scanner.nextLine();
        return choiceInp.equalsIgnoreCase("yes"); // Return true if the user wants to play again
    }
}
