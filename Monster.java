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
            System.out.println("Hey Imma " + skeleton.askName() + ", gimme yer bones!");
        }
        if (name.equalsIgnoreCase("Zombie")) {
            System.out.println("Hey Imma " + zombie.askName() + ", gimme yer brains!");

        }
        if (name.equalsIgnoreCase("Rat")) {
            System.out.println("The " + rat.askName() + " hisses.");
        }

    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    System.out.println(name + " takes " + damage + " damage and now has " + hp + " hp.");
    }


}

