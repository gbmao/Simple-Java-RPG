package interfaces;

import database.GameData;
import items.PlayerBag;
import utils.Utils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {


    public void menu() {

        startingMenu();

    }

    //TODO finish start menu

    public void startingMenu() {


        System.out.println(GameData.roomDescription());
        System.out.println("You see the enemy");// you see an enemy

//        System.out.println("1 - Attack!  ");
//        System.out.println("2 - Enter next room");
        //TODO add inventory


        switch (inputMenu(GameData.create())) {

            case 1 -> {
                System.out.println(BattleMenu.battleStart());
                startingMenu();
            }
            case 2 -> startingMenu();
            case 3 ->
                    System.out.println("HP Potion: " + PlayerBag.bag.getHpPotionCount() + "\tPoison potion: " + PlayerBag.bag.getPoisonPotionCount());
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

