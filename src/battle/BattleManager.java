package battle;

import characters.Enemies;
import characters.Player;
import database.GameData;
import interfaces.Menu;

import static interfaces.BattleMenu.*;


public class BattleManager {
    private Player player;
    private Enemies enemy;

    public BattleManager(Player player, Enemies enemy) {
        this.player = player;
        this.enemy = enemy;

    }

    public void battleStart() {

        switch (battleMenu(enemy, player)) {
            case 1:
                attackTurn(enemy, player);
                break;
            case 2:
                System.out.println("2.Magic(not implemented)");
                break;
            case 3:
                System.out.println("3.Use Item(not implemented");
                break;
            case 4:
                System.out.println("4.RUN(not implemented)");
                break;
            default:
                System.out.println("WTF");
                break;
        }

    }

    private  boolean attackTurn(Enemies enemies, Player p1) {

        enemies.tookDamage(p1.attack());
        if (!enemies.isAlive()) return true;

        p1.tookDamage(enemies.attack());

        if (!p1.isAlive()) return true;
        return false;
    }
}
