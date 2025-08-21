package interfaces;

import characters.Enemies;
import characters.Player;
import locations.Locations;
import utils.Utils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BattleMenu {

    public static void battleStart() {

        //iniciate enemies

        Enemies enemy1 = Utils.enemiesGeneration(Player.player1.getLevel(), Locations.getTotalRooms());

        // describe what player see
        // call for a BattleMenu( with options)
        boolean battleIsOver = false;
        do {
            battleMenu(enemy1);

        } while (!battleIsOver);
    }

    public static void battleMenu(Enemies enemies) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You're facing an " + enemies.getEnemyType() + " with " + enemies.getHealth());
        System.out.println("You have : " + Player.player1.getHealth() + " HP");
        System.out.println("What you want to do?\n");

        System.out.println("1.Attack");
        System.out.println("2.Magic(not implemented)");
        System.out.println("3.Use Item(not implemented");
        System.out.println("4.RUN(not implemented)");


        switch (scanner.nextInt()) {
            case 1:
                Player.player1.playerAttack(enemies);
//                System.out.println(enemies.getEnemyType() + " has " + enemies.getHealth());
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

        //enemy attacks
    }




}
