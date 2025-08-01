import characters.Enemies;
import characters.Player;
import utils.Utils;

public class Game {
    public static void main(String[] args) {
        Player p1 = new Player("boris", 1, 10);
        Enemies slime = new Enemies("Slime", 5, 2);
        System.out.println("Player: " + p1.getName() + " is " + " level " + p1.getLevel() + " and has " + p1.getHealth() + " health.");
        System.out.println("Damage: " + Utils.RNG(8, 10));
        int damage = Utils.RNG(1, 5);
        slime.setHealth(slime.GetHealth() - damage);
        System.out.println("slime took " + damage + " Damage! Health:" + slime.GetHealth()   );
    }

}
