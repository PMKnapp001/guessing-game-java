/** A number guessing game. */
import java.util.Random;
import java.util.Scanner;


public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();
    int randomNumber = randomNum.nextInt(1, 101);
    int guessCount = 0;
  
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");

    //use while loop to play until correct guess is made
    System.out.println("Try to guess the number.");
    System.out.println("Enter your guess: ");
    //get user input (nextInt)
    //increment guessCount per loop
    //use if, elseif, else to dictate logic flow for hints
    //if too high
    //elsif too low
    //else right guess

    //print winning message wih guess count
  }
}
