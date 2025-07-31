import characters.Player;

public class Game {
    public static void main(String[] args) {
        Player p1 = new Player("boris", 1, 10);

        System.out.println("Player: " + p1.getName() + " is " + " level " + p1.getLevel() + " and has " + p1.getHealth() + " health.");

    }

}
