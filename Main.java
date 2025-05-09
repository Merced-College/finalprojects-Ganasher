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

        String gameOn = scanner.next();

        while (gameOn.equalsIgnoreCase("yes") || gameOn.equalsIgnoreCase("yea") || gameOn.equalsIgnoreCase("yeah")) {
            if (i == 0){
                hero(scanner);
                i++;
            }

                //create a monster
            Monster currentMonster = monster();

        //fight the monster in the while loop
            while (hero.getHp() > 0 && currentMonster.getHp() > 0) {
                System.out.println("Your HP: " + hero.getHp() + " | Monster HP: " + currentMonster.getHp());
                System.out.println("Press Enter to attack...");
                scanner.nextLine();

                int playerDamage = MyUtilities.oneDEightAttack(); // Choose dice based on weapon later
                System.out.println("You strike with your " + hero.getWeapon() + " for " + playerDamage + " damage!");
                currentMonster.takeDamage(playerDamage);

            // Check if monster is defeated
                if (currentMonster.getHp() <= 0) {
                    System.out.println("You have defeated the " + currentMonster.askName() + "!");
                    break;
                }

                else if (currentMonster.getHp() > 0){
                     int monsterDamage = MyUtilities.oneDEightAttack(); // Choose dice based on weapon later
                     System.out.println("You are attacked for " + monsterDamage + " damage!");
                     hero.takeDamage(monsterDamage);  
                }


        }

            //check if player wishes to continue
            if (hero.getHp() > 0){
                System.out.println("Would you like to fight another monster?");
                gameOn = scanner.next();

                //quit game
                if (!(gameOn.equalsIgnoreCase("yes") || gameOn.equalsIgnoreCase("yea") || gameOn.equalsIgnoreCase("yeah"))){
                    System.out.println("I guess you have something better to do.");
                }
            }

            //dies
            else if (hero.getHp() <= 0){
                System.out.println("You are dead!");
                gameOn = "Dead";
            }
        } 



        

        // Close the scanner
        scanner.close();   
        
    }




         //making a hero, data structure array
    public static void hero(Scanner scanner){
        String[] weapons = {
            "dagger",       // index 0
            "Short Sword",  // index 1
            "Long Sword",   // index 2
            "Halberd",      // index 3
            "Axe",          // index 4
            "Great Sword"   // index 5
        };

        int randomNumberForWeapon = (int) (Math.random() * weapons.length);
        String weapon = weapons[randomNumberForWeapon];

        System.out.println("What's your name hero?");
        String playerName = scanner.next();
        
        hero = new Player(playerName, 20, 10, weapon);

        System.out.println("Hello " + hero.playerNameAsk() + ". Welcome to Monster Fight Club!");
        System.out.println("You awaken with a " + weapon + ".");

    }



      //Generates a random Monster!
    public static Monster monster() {
        Monster[] monsters = {
        new Monster("Skeleton", "Short Sword", true, 13, 14),
        new Monster("Zombie", "Bite", true, 15, 8),
        new Monster("Rat", "Bite", true, 1, 10)
    };

    int randomIndex = (int) (Math.random() * monsters.length);
    return monsters[randomIndex];

    }

    
}