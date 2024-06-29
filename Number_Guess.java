import java.util.Scanner;

class Player {
    int numGuess;
    public int id;

    Player(int i) {
        id = i;
    }

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey Player " + id + ", guess the number: ");
        numGuess = sc.nextInt();
        return numGuess;
    }
}

class Guesser {
    int numGuess;

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey Guesser, guess the number: ");
        numGuess = sc.nextInt();
        return numGuess;
    }
}

class Umpire {
    int numGuess; // The number to be guessed which is given by guesser
    int numP1; // The number guessed by Player 1
    int numP2; // The number guessed by Player 2
    int numP3; // The number guessed by Player 3

    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        numGuess = guesser.guessNumber();
    }

    public void collectFromPlayers() {
        Player p1 = new Player(1);
        Player p2 = new Player(2);
        Player p3 = new Player(3);
        numP1 = p1.guessNumber();
        numP2 = p2.guessNumber();
        numP3 = p3.guessNumber();
    }

    public void calcResult() {
       

        System.out.println("Guesser's number: " + numGuess);
        System.out.println("Player 1 number: " + numP1);
        System.out.println("Player 2 number: " + numP2);
        System.out.println("Player 3 number: " + numP3);        


        if (numGuess==numP1) {
            
            if (numGuess==numP2 && numGuess==numP3){
                System.out.println("All are winners.");
            }

            else if(numGuess == numP2){
                System.out.println("Both Player 1 and Player 2 are the wuinners.");
            }

            else if(numGuess == numP3){
                System.out.println("Both Player 1 and Player 3 are the winners.");
            }

            else{
                System.out.println("Player 1 is the winner");
            }

        
        }

        else if (numGuess==numP2){
            if (numGuess== numP3){
                System.out.println("Both Player 2 and Player 3 are the winners.");
            }

            else{
                System.out.println("Player 2 is the winner");
            }

        }

        else if (numGuess == numP3){
            System.out.println("Player 3 is the winner.");
        }

        else{
            System.out.println("Losers...");
        }
    }
}

public class Number_Guess {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayers();
        umpire.calcResult();
    }
}

