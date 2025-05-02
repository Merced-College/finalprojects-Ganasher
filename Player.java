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
}
