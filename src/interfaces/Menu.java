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


        switch (inputMenu(Utils.create())) {

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
    public int inputMenu(List<String> list) {
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


//        for (int row = 1; row <= 25; row++) {
//
//            for (int column = 1; column <= 100; column++) {
//
//                String barra = "|";
//                // print superior and inferior border
//                if (row == 1 || row == 25) {
//                    System.out.print("-");
//                } else if (column == 1) {
//                    System.out.print("|");
//
//                }
//                else if (column == 70) {
//
//                    System.out.print("|");
//
//                } else if (column == 100) {
//
//
//                    System.out.print("|");
//                } else {
//
//                    System.out.print(" ");
//                }
//
//
//
//
//
//
//
//                //print lateral border
/// /                    if (column == 1 || column == 100) {
/// /
/// /                        // metodo de digitar  algo: rowText deve ser inserido aqui
/// /                        // inserido dentro de if para evitar repetir a barra 2x
/// /                        if (!rowText(column, row, 10, "text")) {
/// /
/// /                            System.out.printf("%-70s",  barra); //TODO ajustar tamanho para se adequar a uma nova criacao de uma barra lateral
/// ///                            System.out.printf( barra); //TODO ajustar tamanho para se adequar a uma nova criacao de uma barra lateral
/// /                        }
/// /                    }
//
//
//            }
//
//            System.out.println();
//
//        }
//
//    }
//
//    //boolean para evitar repeticao com o codigo que cria as barras laterais.
//    // algum metodo melhor???
//    //TODO inserir texto atraves de uma variavel String
//    // checar quantidade maxima de character na string para quebrar antes de extrapolar
//    public static boolean rowText(int column, int row, int rowTarget, String text) {
//
//        if (column == 1 && row == rowTarget) {
/// /            System.out.print("| ");
//            System.out.printf("%-66s", text); // cuidado para nao consumir espaco alem do possivel
//            return true;
//        }
//        return false;
//    }
