package interfaces;
import characters.Enemies;
import characters.Player;
import database.GameData;
import database.GameItems;
import locations.Locations;
import utils.Utils;

public class BattleMenu {

    public static String battleStart() {

        //iniciate enemies

        Enemies enemy1 = Utils.enemiesGeneration(Player.player1.getLevel(), Locations.getTotalRooms());
//        Enemies enemy1 = Npc.first;
//        CombatGroup combatGroup = new CombatGroup(true);
        // describe what player see
        // call for a BattleMenu( with options)
        boolean battleIsOver = false;
        do {
           battleIsOver = battleMenu(enemy1);

        } while (!battleIsOver);

        battleOver(enemy1);
        GameData.showInventory(GameItems.inventory);
        Player.player1.addXp(enemy1.getXp());
        return "\n\n You walk away from the dead enemy towards a new room\n\n ";
    }

    public static boolean battleMenu(Enemies enemies) {
        System.out.println("-".repeat(10));
        System.out.println("You're facing an " + enemies.getEnemyType() + " with " + enemies.getHealth() + " HP");
        System.out.println("You have : " + Player.player1.getHealth() + " HP");
        System.out.println("What you want to do?\n");




        switch (Menu.inputMenu(GameData.battleChoices())) {
            case 1: return attackTurn(enemies);

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

        return false;
        //enemy attacks
    }

    public static boolean attackTurn(Enemies enemies){

        enemies.tookDamage(Player.player1.attack());
        if(!enemies.isAlive()) return true;

        Player.player1.tookDamage(enemies.attack());

        if (!Player.player1.isAlive()) return true;
        return false;
    }

    public static void battleOver(Enemies enemies){

        System.out.println("\nThe battle is over!");
        if (!enemies.isAlive()) {
            System.out.println(enemies.getEnemyType() + " Died and gave : " +
                    enemies.getXp() + " XP");
            Player.player1.addXp(enemies.getXp());
            enemies.dropItem();

        } else if (!Player.player1.isAlive()) {
            System.out.println("YOU DIED");

        }

    }




}
