package net.starANDstripes;

import java.util.Scanner;

public class Quiz {
    private String[] questions;
    private String[] correctAnswers;
    private int score;

    public Quiz() {
        // Initialize the quiz data
        questions = new String[]{
                "What is 2 + 2:",
                "What planet is known as the Red Planet?",
                "What color is the sky?",
                "The biggest ocean?",
                "What is 15/5?"
        };
        correctAnswers = new String[]{
                "4",
                "Mars",
                "Blue",
                "Pacific",
                "3"
        };
        score = 0;
    }

    // Method to start the quiz and return the score
    public int start(Scanner scanner) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String ansInput = scanner.nextLine().trim(); // Read user input

            if (ansInput.equalsIgnoreCase(correctAnswers[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers[i]);
            }
        }
        return score;
    }
}