package database;

import items.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameItems {
    public static Items hpPotion = new Items("hp", "Restore 2 Health Points", 2);
    public static Items poisonPotion = new Items("Poison potion", "Imbues your weapon with poison", 1);


    //    public static List<Items> inventory = new ArrayList<>();
    public static Map<Items, Integer> inventory = new HashMap<>();

    public static void addItem(Items item, int amount) {


        int current = inventory.getOrDefault(item, 0);
        inventory.put(item, current + amount);


    }

    public static void removeItem(Items item, int amount) {

        int current = inventory.getOrDefault(item, 0);
        inventory.put(item, Math.max(current - amount, 0));
    }
}
