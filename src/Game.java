import database.GameData;
import database.GameItems;
import interfaces.Menu;
import utils.Utils;

public class Game {
    public static void main(String[] args) {


//        Utils.initialChoices.add("teste");

//        Menu menu = new Menu();
//
//        menu.menu();

        GameItems.addItem(GameItems.hpPotion, 5);
        GameData.showInventory(GameItems.inventory);
        GameItems.addItem(GameItems.hpPotion, 1);
        GameItems.addItem(GameItems.poisonPotion, 3);
        GameData.showInventory(GameItems.inventory);

        GameItems.removeItem(GameItems.hpPotion, 2);
        GameItems.removeItem(GameItems.poisonPotion, 5);
        GameData.showInventory(GameItems.inventory);



    }

}
