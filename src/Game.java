import characters.Enemies;
import characters.Player;

import database.GameData;
import database.GameItems;
import interfaces.Menu;
import items.HealingPotions;
import utils.Utils;

public class Game {
    public static void main(String[] args) {


//        Utils.initialChoices.add("teste");
        interfaces.Menu menu = new Menu();
//        Menu menu = new Menu();
        //criar um metodo para criar players
        Player p1 = new Player();
        menu.menu(p1);



        // test
//        GameItems.addItem(GameItems.hpPotion, 5);
//        GameData.showInventory(GameItems.inventory);
//        GameItems.addItem(GameItems.hpPotion, 1);
//        GameItems.addItem(GameItems.poisonPotion, 3);
//        GameData.showInventory(GameItems.inventory);
//
//        GameItems.removeItem(GameItems.hpPotion, 2);
//        GameItems.removeItem(GameItems.poisonPotion, 5);
//        GameData.showInventory(GameItems.inventory);
//
//        String teste = GameItems.hpPotion.toString();
//        System.out.println(teste);
//
//        System.out.println("total hp: " + Player.player1.getHealth() + " max hp  " + Player.player1.getMaximumHealth());
//        Player.player1.tookDamage(6);
//        System.out.println("total hp: " + Player.player1.getHealth() + " max hp  " + Player.player1.getMaximumHealth());
//        Player.player1.heal(GameItems.hpPotion);
//        System.out.println("total hp: " + Player.player1.getHealth() + " max hp  " + Player.player1.getMaximumHealth());
//        Player.player1.heal(GameItems.hpPotion);
//        Player.player1.heal(GameItems.hpPotion);
//        System.out.println("total hp: " + Player.player1.getHealth() + " max hp  " + Player.player1.getMaximumHealth());


    }

}
