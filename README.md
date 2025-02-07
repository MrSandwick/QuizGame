# Star and Stripes Quiz Game

## Project Description

This project is a console-based game written in Java that offers the user a quiz with five questions. The game includes a scoring system and an option to replay the game.

## Table of Content

- [Project Components](#project-components)
- [How to Run](#how-to-run)
- [How to Play](#how-to-play)
- [Project Structure](#project-structure)
- [Important Classes](#important-classes)
- [Example of Game Output](#example-of-game-output)

### Project Components:
- **Main.java** - The main class that starts the game.
- **Quiz.java** - The class that handles the questions and answers for the quiz.
- **Game.java** - The class that controls the game flow.

### How to Run:

1. Ensure that you have JDK version 8 or higher installed.
2. Download or clone the repository.
3. Compile the project with the following command:
```bash
   javac -d . *.java
```
4. Run the Game
```bash
java net.starANDstripes.Main
```

### How to Play
1. The game will ask 5 questions in sequence.
2. For each question, input your answer into the console.
3. If your answer is correct, you will receive 1 point.
4. After the game ends, your total score will be displayed.
5. You will be asked if you want to play again. Type yes to start a new game or no to exit the game.

### Project Structure
StarAndStripesQuizGame/
├── Main.java
├── Quiz.java
├── Game.java
└── README.md

### Important Classes
- Main.java: Contains the main method, which starts the game by creating a Game object and calling its run() method.
- Quiz.java: Contains the questions and correct answers for the quiz, as well as the start() method to run the quiz.
- Game.java: Manages the game flow, calls the Quiz class methods, tracks the score, and asks the user whether they want to play again.

### Example of Game Output
What is 2 + 2:
4
Correct!

What planet is known as the Red Planet?
Mars
Correct!

What color is the sky?
Blue
Correct!

The biggest ocean?
Pacific
Correct!

What is 15/5?
3
Correct!

Your score: 5/5
Do you want to play again? (yes/no): no
Thank you for playing!