package database;

import items.HealingPotions;
import items.Items;
import items.OffensePotions;

import java.util.HashMap;
import java.util.Map;

public class GameItems {
    public static HealingPotions hpPotion = new HealingPotions("Small health potion",
            "Restore ", 5);
    public static OffensePotions poisonPotion = new OffensePotions("Poison potion",
            "Imbues your weapon with poison", 2);


    //    public static List<Items> inventory = new ArrayList<>();
    public static Map<Items, Integer> inventory = new HashMap<>();

    public static void addItem(Items item, int amount) {


        int current = inventory.getOrDefault(item, 0);
        inventory.put(item, current + amount);


    }

    public static void removeItem(Items item, int amount) {

        int current = inventory.getOrDefault(item, 0);
        inventory.put(item, Math.max(current - amount, 0));
        if(inventory.getOrDefault(item, 0) == 0){
            inventory.remove(item);
        }

    }
}
