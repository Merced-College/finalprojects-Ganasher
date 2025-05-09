public class Player {
    String name;
    int hp;
    int ac;
    String weapon;
    int gold;

    public Player(String name, int hp, int ac, String weapon, int gold) {
        this.name = name;
        this.hp = hp;
        this.ac = ac;
        this.weapon = weapon;
        this.gold = gold;
    }

    public String playerNameAsk(){
        return name;
    }

    void askHp() {
        System.out.println(name + " has " + hp + " hp.");

    }

    public int getHp(){
        return hp;
    }

    public String getWeapon(){
        return weapon;
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
        System.out.println("Your armor protects you!");
        }
    }

    public void addGold(int newGold){
        gold += newGold; 
    }

    public int getGold (){
        return gold;
    }
}
