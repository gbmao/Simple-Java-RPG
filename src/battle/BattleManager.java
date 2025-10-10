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

        boolean flag = true;

        while (flag) {
            switch (battleMenu(enemy, player)) {
                case 1:
                    flag = attackTurn(enemy, player);
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

    }

    private boolean attackTurn(Enemies enemies, Player p1) {

        enemies.tookDamage(p1.attack());
//        System.out.println(enemies.getEnemyType() + " took " + p1.attack() + " damage!"); // TODO change p1.attack() to  damage received
        damageMessage(enemies.getEnemyType(), p1.attack());
        if (!enemies.isAlive()) {
//            System.out.println(enemies.getEnemyType() + " DIED!");
            deathMessage(enemies.getEnemyType());
            return false;
        }

        p1.tookDamage(enemies.attack());
//        System.out.println(p1.getName() + " took " + enemies.attack() + " damage!");
        damageMessage(p1.getName(),enemies.attack());
        if (!p1.isAlive()) {
//            System.out.println(p1.getName() + " DIED!");
            deathMessage(p1.getName());
            return false;

        }
        return true;
    }
}
