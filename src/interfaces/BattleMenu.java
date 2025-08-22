package interfaces;

import characters.Enemies;
import characters.Player;
import database.GameData;
import jdk.jshell.execution.Util;
import locations.Locations;
import utils.Utils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BattleMenu {

    public static String battleStart() {

        //iniciate enemies

        Enemies enemy1 = Utils.enemiesGeneration(Player.player1.getLevel(), Locations.getTotalRooms());

        // describe what player see
        // call for a BattleMenu( with options)
        boolean battleIsOver = false;
        do {
           battleIsOver = battleMenu(enemy1);

        } while (!battleIsOver);

        battleOver(enemy1);

        return "\n\n You walk away from the dead enemy towards a new room\n\n ";
    }

    public static boolean battleMenu(Enemies enemies) {

        System.out.println("You're facing an " + enemies.getEnemyType() + " with " + enemies.getHealth() + " HP");
        System.out.println("You have : " + Player.player1.getHealth() + " HP");
        System.out.println("What you want to do?\n");




        switch (Menu.inputMenu(GameData.battleOptions())) {
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

        System.out.println(Player.player1.getName() + " ATTACKS! " );
        System.out.println(enemies.getEnemyType() + " took " + Player.player1.getDamage() + " damage\n");
        enemies.tookDamage(Player.player1.getDamage());
        if(!enemies.isAlive()) return true;

        System.out.println(enemies.getEnemyType() + " ATTACKS! " );
        System.out.println(Player.player1.getName() + " took " + enemies.getAttackDamage()  + " damage\n");
        Player.player1.tookDamage(enemies.getAttackDamage());
        if (!Player.player1.isAlive()) return true;
        return false;
    }

    public static void battleOver(Enemies enemies){

        System.out.println("\nThe battle is over!");
        if (!enemies.isAlive()) {
            System.out.println(enemies.getEnemyType() + " Died and gave : " +
                    enemies.getXp() + " XP");
            Player.player1.addXp(enemies.getXp());
        } else if (!Player.player1.isAlive()) {
            System.out.println("YOU DIED");

        }

    }




}
