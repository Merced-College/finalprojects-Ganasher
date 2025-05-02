import java.util.Random;
import java.util.Scanner;

//Gabriel Bostic
//5-1-2025
//Game Final Project
//Monster Fight Club


public class Main {

    public static void main(String[] args) {
        int i = 0;
        

        
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to fight a monster?");

        // Get user guess
        String gameOn = scanner.next();

        // Check guess
        while (gameOn.equalsIgnoreCase("yes")) {
            if (i == 0){
                hero(scanner);
                i++;
            }

            monster();
            System.out.println("Would you like to fight another monster?");
            gameOn = scanner.next();
        } 

        System.out.println("I guess you have something better to do.");
        
        // Close the scanner
        scanner.close();     
    }


    //making a hero
    public static void hero(Scanner scanner){
        System.out.println("What's your name hero?");
        String playerName = scanner.next();
        Player hero = new Player(playerName, 20, 10);

        System.out.println("Hello " + hero.playerNameAsk() + ". Welcome to Monster Fight Club!");
    }



    //this makes a monster! It eventually will make a random monster, hopefully there will be about 4 different ones
    //For now it makes a skeleton as a placeholder so I can get all the moving parts of the first monster moving
    //After that is should be easy to copy the "skeleton" of the monster class between ideas
    public static void monster() {
        int randomNumberForMonster = (int) (Math.random() * 3) + 1;
        int randomNumberForWeapon = (int) (Math.random() * 6) + 1;
        
            if (randomNumberForMonster == 1) {
                Monster skeleton = new Monster( "Skeleton",  "Short Sword", true, 13, 14);
                System.out.println("Hey Imma " + skeleton.askName() + ", gimme yer bones!");
                skeleton.askWeapon();
                skeleton.askHp();
                skeleton.askAc();
                System.out.println("You take " + MyUtilities.twoDSixAttack() + " damage.");
            }

            if (randomNumberForMonster == 2) {
                Monster zombie = new Monster( "Zombie",  "Short Sword", true, 15, 8);
                System.out.println("Hey Imma " + zombie.askName() + ", gimme yer brains!");
                zombie.askWeapon();
                zombie.askHp();
                zombie.askAc();
                System.out.println("You take " + MyUtilities.twoDSixAttack() + " damage.");
            }

            if (randomNumberForMonster == 3) {
                Monster rat = new Monster( "Rat",  "Bite", true, 1, 10);
                System.out.println("The " + rat.askName() + " hisses.");
                rat.askWeapon();
                rat.askHp();
                rat.askAc();
                System.out.println("You take " + MyUtilities.twoDSixAttack() + " damage.");
            }
    }

    
}