import java.util.Random;
import java.util.Scanner;

//Gabriel Bostic
//5-1-2025
//Game Final Project
//Monster Fight Club


public class Main {
    static Player hero;
    public static void main(String[] args) {
        int i = 0;
        

        
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to fight a monster?");

        // Get user guess
        String gameOn = scanner.next();

        // Check guess
        while (gameOn.equalsIgnoreCase("yes") || gameOn.equalsIgnoreCase("yea") || gameOn.equalsIgnoreCase("yeah")) {
            if (i == 0){
                hero(scanner);
                i++;
            }

            monster();
            System.out.println("Would you like to fight another monster?");
            gameOn = scanner.next();
        } 



        hero.askHp();
        System.out.println("I guess you have something better to do.");

        // Close the scanner
        scanner.close();   
        
    }




    //making a hero
    public static void hero(Scanner scanner){
        String weapon;

        System.out.println("What's your name hero?");
        String playerName = scanner.next();
        int randomNumberForWeapon = (int) (Math.random() * 6) + 1;
        if (randomNumberForWeapon == 1){
            weapon = "dagger";
        }
        else if (randomNumberForWeapon == 2){
            weapon = "Short Sword";
        }
        else if (randomNumberForWeapon == 3){
            weapon = "Long Sword";
        }
        else if (randomNumberForWeapon == 4){
            weapon = "Halberd";
        }
        else if (randomNumberForWeapon == 5){
            weapon = "Axe";
        }
        else {
            weapon = "Great Sword";
        }
        
        hero = new Player(playerName, 20, 10, weapon);

        System.out.println("Hello " + hero.playerNameAsk() + ". Welcome to Monster Fight Club!");
        System.out.println("You awaken with a " + weapon + ".");

    }

    //Generates a random Monster!
    public static void monster() {
        int randomNumberForMonster = (int) (Math.random() * 3) + 1;
        
            if (randomNumberForMonster == 1) {
                Monster skeleton = new Monster( "Skeleton",  "Short Sword", true, 13, 14);
                System.out.println("Hey Imma " + skeleton.askName() + ", gimme yer bones!");
                skeleton.askWeapon();
                skeleton.askHp();
                skeleton.askAc();
                System.out.println("You take " + MyUtilities.twoDSixAttack() + " damage.");
            }

            if (randomNumberForMonster == 2) {
                Monster zombie = new Monster( "Zombie",  "Bite", true, 15, 8);
                System.out.println("Hey Imma " + zombie.askName() + ", gimme yer brains!");
                zombie.askWeapon();
                zombie.askHp();
                zombie.askAc();
                System.out.println("You take " + MyUtilities.oneDEightAttack() + " damage.");
            }

            if (randomNumberForMonster == 3) {
                Monster rat = new Monster( "Rat",  "Bite", true, 1, 10);
                System.out.println("The " + rat.askName() + " hisses.");
                rat.askWeapon();
                rat.askHp();
                rat.askAc();
                System.out.println("You take " + MyUtilities.oneDFourAttack() + " damage.");
            }
    }

    
}