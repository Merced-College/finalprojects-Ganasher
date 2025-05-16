public class Monster {
    String name;
    String weapon;
    Boolean alive;
    int hp;
    int ac;
    
    //Google AI how to create a class, then edited from dog to my use cases
    public Monster(String name, String weapon, Boolean alive, int hp, int ac) {
        this.name = name;
        this.weapon = weapon;
        this.alive = alive;
        this.hp = hp;
        this.ac = ac;
    }



    void askWeapon() {
        System.out.println("It has a deadly " + weapon + ".");

    }

    void askHp() {
        System.out.println("The " + name + " has " + hp + " hp.");

    }

    public int getHp(){
        return hp;
    }

    void askAc() {
        System.out.println("The " + name + " has an ac of " + ac + ".");

    }

    String askName() {
        return name;

    }

    void battleCry(){
        if (name.equalsIgnoreCase("Skeleton")) {
            System.out.println("Hey Imma Skeleton, gimme yer bones!");
        }
        if (name.equalsIgnoreCase("Zombie")) {
            System.out.println("Hey Imma Zombie gimme yer brains!");
        }
        if (name.equalsIgnoreCase("Rat")) {
            System.out.println("The Rat hisses.");
        }
        if (name.equalsIgnoreCase("Dragon")) {
            System.out.println("The Dragon roars. You are screwed.");
        }

    }

    void deathRattle(){
        if (name.equalsIgnoreCase("Skeleton")) {
            System.out.println("My Bones!");
        }
        if (name.equalsIgnoreCase("Zombie")) {
            System.out.println("SQUISH! CRUNCH!");
        }
        if (name.equalsIgnoreCase("Rat")) {
            System.out.println("You have killed a rodent of Unusual Size!");
        }
        if (name.equalsIgnoreCase("Dragon")) {
            System.out.println("The Dragon roars it's final roar! You are the Slayer!");
        }

    }

    public void takeDamage(int damage) {
        if (damage > ac){
            hp -= (damage - ac);
            if (hp < 0) {
                hp = 0;
            }
        System.out.println(name + " takes " + (damage - ac) + " damage and now has " + hp + " hp.");
        }
        else if (damage <= ac){
        System.out.println("Your attack misses!");
        }
    }


}

