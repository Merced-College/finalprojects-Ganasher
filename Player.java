public class Player {
    String name;
    int hp;
    int ac;

    public Player(String name, int hp, int ac) {
        this.name = name;
        this.hp = hp;
        this.ac = ac;
    }

    public String playerNameAsk(){
        return name;
    }
}
