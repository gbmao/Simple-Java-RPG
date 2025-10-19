package interfaces;

import database.GameData;
import database.GameItems;

public class InventoryMenu {

    public static void inventoryMenu(){
        switch (Menu.inputMenu(GameData.inventoryChoices(GameItems.inventory))) {
            case 1:
                // show

                break;
            case 2:
                //use
                break;
            case 3:
                //delete
                break;

            default:
                System.out.println("WTF");
                break;
        }
    }
}
