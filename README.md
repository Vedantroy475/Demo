# Java-Projects
# Java Guesser Game

## Description

This is a simple number guessing game implemented in Java. The game consists of one Guesser and three Players. The Guesser picks a number, and the Players try to guess that number. The Umpire manages the game, collects guesses from the Guesser and Players, and determines the winner(s).

## How to Play

1. The Guesser selects a number.
2. Each Player tries to guess the number.
3. The Umpire collects the guesses from the Guesser and the Players.
4. The Umpire compares the guesses and announces the winner(s).

## Classes and Methods

### `Player` Class

- **Attributes:**
  - `int numGuess`: The number guessed by the player.
  - `int id`: The identifier for the player.
  
- **Constructor:**
  - `Player(int i)`: Initializes the player with an ID.

- **Methods:**
  - `int guessNumber()`: Prompts the player to guess a number and returns the guessed number.

### `Guesser` Class

- **Attributes:**
  - `int numGuess`: The number guessed by the Guesser.
  
- **Methods:**
  - `int guessNumber()`: Prompts the Guesser to guess a number and returns the guessed number.

### `Umpire` Class

- **Attributes:**
  - `int numGuess`: The number to be guessed, provided by the Guesser.
  - `int numP1`: The number guessed by Player 1.
  - `int numP2`: The number guessed by Player 2.
  - `int numP3`: The number guessed by Player 3.
  
- **Methods:**
  - `void getNumberFromGuesser()`: Gets the number from the Guesser.
  - `void collectFromPlayers()`: Collects the guesses from the Players.
  - `void calcResult()`: Calculates and announces the result.

### `Number_Guess` Class

- **Methods:**
  - `public static void main(String[] args)`: The main method which initializes the Umpire and starts the game.

## How to Run

1. Compile the Java files:
   ```sh
   javac Number_Guess.java
java Number_Guess


Hey Guesser, guess the number: 5
Hey Player 1, guess the number: 3
Hey Player 2, guess the number: 5
Hey Player 3, guess the number: 7
Guesser's number: 5
Player 1 number: 3
Player 2 number: 5
Player 3 number: 7
Player 2 is the winner.
# Java-Projects
