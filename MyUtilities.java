//class for actions
//idea for final and private by Google AI, to prevent "inheritance" and "instantiation". Not sure if necessary.
//Contents of class beyond safeguards are mine
final class MyUtilities {
    
    private MyUtilities() {
        //for preventing instantiation?
    }

    public static int oneDFourAttack() {
        int damage = (int) (Math.random() * 4) + 1;
        return damage;
    }

    public static int oneDSixAttack() {
        int damage = (int) (Math.random() * 6) + 1;
        return damage;
    }

    public static int oneDEightAttack() {
        int damage = (int) (Math.random() * 8) + 1;
        return damage;
    }

    public static int oneDTenAttack() {
        int damage = (int) (Math.random() * 10) + 1;
        return damage;
    }

    public static int oneDTwelveAttack() {
        int damage = (int) (Math.random() * 12) + 1;
        return damage;
    }

    public static int twoDSixAttack() {
        int damage = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
        return damage;
    }
}
