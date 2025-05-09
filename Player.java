public class Player {
    String name;
    int hp;
    int ac;
    String weapon;

    public Player(String name, int hp, int ac, String weapon) {
        this.name = name;
        this.hp = hp;
        this.ac = ac;
        this.weapon = weapon;
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
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    System.out.println(name + " takes " + damage + " damage and now has " + hp + " hp.");
    }
}
