package interfaces;

import database.GameData;
import database.GameItems;

public class InventoryMenu {

    public static void inventoryMenu(){
        switch (Menu.inputMenu(GameData.inventoryChoices(GameItems.inventory))) {
            case 1:
                System.out.println("Not implemented");
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
    }
}
