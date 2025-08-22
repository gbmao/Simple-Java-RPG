package interfaces;

import characters.Enemies;
import characters.Player;
import database.GameEnemies;
import database.GameLocations;
import items.PlayerBag;
import locations.Locations;

import java.util.Scanner;

public class Menu {



    public void menu() {

        startingMenu();

    }

    //TODO finish start menu

    public void startingMenu() {


        System.out.println(GameLocations.roomDescription());
        System.out.println("You see the enemy");// you see an enemy

        System.out.println("1 - Attack!  ");
        System.out.println("2 - Enter next room");
        //TODO add inventory

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {

            case 1 -> {
                System.out.println(BattleMenu.battleStart());
                startingMenu();
            }
            case 2 -> startingMenu();
            case 3 ->
                    System.out.println("HP Potion: " + PlayerBag.bag.getHpPotionCount() + "\tPoison potion: " + PlayerBag.bag.getPoisonPotionCount());
        }
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }



    public void inventory(){
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
////            System.out.print("| ");
//            System.out.printf("%-66s", text); // cuidado para nao consumir espaco alem do possivel
//            return true;
//        }
//        return false;
//    }
