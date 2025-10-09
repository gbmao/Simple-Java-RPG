package inventory;

import java.util.List;

import static database.GameItems.hpPotion;
import static database.GameItems.poisonPotion;

public class Teste {
    public static void main(String[] args) {

    Inventory bag = new Inventory();
        bag.addItem(hpPotion);
        bag.showInventory();
        bag.addItem(hpPotion);
        bag.showInventory();
        bag.addItem(poisonPotion);
        bag.addItem(hpPotion);
        bag.showInventory();
        bag.addItem(poisonPotion);
        bag.showInventory();
        bag.useItem(hpPotion);
        bag.showInventory();
        bag.useItem(hpPotion);
        bag.useItem(hpPotion);
       // bag.useItem(hpPotion);
        bag.showInventory();

        System.out.println();

    }
}
