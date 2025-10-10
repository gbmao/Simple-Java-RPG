package interfaces;

import battle.BattleManager;
import characters.Player;
import database.GameData;
import database.GameItems;
import world.GameWorld;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {


    public void menu(Player p1, GameWorld world) {

        boolean flag = true;
        while (flag) {
            startingMenu(p1, world);
            flag = p1.isAlive();
        }

    }

    //TODO finish start menu

    public void startingMenu(Player p1, GameWorld world) {


        world.roomDescription();// shows room description
        //System.out.println("Room number: " + world.getLocation().getRoomNumber());
        if (!world.getLocation().roomEnemy().isAlive()) {
            System.out.println("You see an dead body in the ground!");

        } else {
            System.out.println("You see the enemy");// you see an enemy

        }


//        System.out.println("1 - Attack!  ");
//        System.out.println("2 - Enter next room");
        //TODO add inventory


        switch (inputMenu(GameData.roomChoices(world))) {

            case 1 -> {
                if (world.getLocation().roomEnemy().isAlive()) {
//                    System.out.println(BattleMenu.battleStart(p1, world.getLocation()));

                    //create battle
                    BattleManager battle = new BattleManager(p1,p1.getLocation().roomEnemy());
                    battle.battleStart();

                } else {
                    System.out.println("That's a dead " + world.getLocation().roomEnemy().getEnemyType());
                }

            }
            case 2 -> world.goForward();
            case 3 -> world.goBack();
            case 4 -> InventoryMenu.inventoryMenu();

        }
    }

    /**
     * @param list list with all the possible choices
     * @return Return the input from the user
     */
    public static int inputMenu(List<String> list) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " " + list.get(i));
        }

        boolean valid = false;
        int response = -1;

        while (!valid) {
            try {
                System.out.println("Chose an option: ");
                response = scanner.nextInt();

                if (response <= list.size() && response > 0) {
                    valid = true;
                } else {
                    System.out.println("Please enter a number between 1 and " + list.size());
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number between 1 and " + list.size());
                scanner.nextLine();
            }
        }


        return response;

    }


    public void inventory() {
        //TODO create a new class to manage the inventory

    }
}

