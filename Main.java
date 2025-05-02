import java.util.Random;
import java.util.Scanner;

//Gabriel Bostic
//5-1-2025
//Game Final Project



public class Main {

    public static void main(String[] args) {
        
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Generate random number between 1 and 20
        int randomNumber = (int) (Math.random() * 20) + 1;

        System.out.println("Guess a number between 1 and 20:");

        // Get user guess
        int guess = scanner.nextInt();

        // Check guess
        if (guess == randomNumber) {
            System.out.println("Correct! You guessed the number.");
        } else {
            System.out.println("Wrong! The number was: " + randomNumber);
        }

        // Close the scanner
        scanner.close();

        monster();
    }

    //this makes a monster! It eventually will make a random monster, hopefully there will be about 4 different ones
    //For now it makes a skeleton as a placeholder so I can get all the moving parts of the first monster moving
    //After that is should be easy to copy the "skeleton" of the monster class between ideas
    public static void monster() {
        int randomNumberForWeapon = (int) (Math.random() * 20) + 1;
        
        Monster skeleton = new Monster( "Skeleton",  "Short Sword", true, 60, 12);
        System.out.println("Hey Imma " + skeleton.askName() + ", gimme yer munny!");
        skeleton.askWeapon();
        skeleton.askHp();
        skeleton.askAc();
        System.out.println("You take " + MyUtilities.twoDSixAttack() + " damage.");
    }

    
}