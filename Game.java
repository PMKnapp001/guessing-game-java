/** A number guessing game. */
import java.util.Random;
import java.util.Scanner;


public class Game {
  public static void main(String[] args) {
    
    //instantiate scanner and random objects
    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();

    //declare variables to be used in guessing game
    int randomNumber = randomNum.nextInt(101);   //random number that needs to be guessed by player
    int guessCount = 0;                                           //counter to keep track of guesses
    int guess = 0;                                                //variable to hold user's guess
  
    //print statements to start game
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Enter your name: ");
    String name = input.nextLine();         //get player name from input
    System.out.println(name + ", I'm thinking of a number between 0 and 100.");
    System.out.println("Try to guess the number.");

    //use while loop to play until correct guess is made
    while (guess != randomNumber) {
      System.out.println("Enter your guess: ");
      guess = input.nextInt();
      input.nextLine();
      System.out.println();
      guessCount++;

      if (guess > randomNumber) {
        System.out.println("Your guess is too high, try again.");
      }
      else if (guess < randomNumber) {
        System.out.println("Your guess is too low, try again.");
      }
    }

    System.out.println("Well done " + name + "! You found my number in " + guessCount + " tries!");
  }
}
