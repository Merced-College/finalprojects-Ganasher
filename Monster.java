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
        System.out.println("I have a " + weapon + ".");

    }

    void askHp() {
        System.out.println("I have " + hp + " hp.");

    }

    void askAc() {
        System.out.println("I have an ac of " + ac + ".");

    }

    String askName() {
        return name;

    }
}

