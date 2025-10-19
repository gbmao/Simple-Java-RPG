package inventory;

import items.Items;

import javax.management.ConstructorParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private int maxSize;
    private Map<Items, Integer> items; //TODO change key to be more simple and Integer to be the Item

    /**
     * Always start with 10 in size
     */
    public Inventory() {
        this.maxSize = 10;
        this.items = new HashMap<>();
    }

    private boolean isFull(){
        return items.size() == maxSize;
    }

    /**
     * First check if inventory is full
     * @param item
     */
    public void addItem(Items item) {
        if(isFull() && !items.containsKey(item)) {
            System.out.println("Inventory is FULL");
        } else {

        items.put(item, items.getOrDefault(item, 0) + 1 );
        }
    }

    /**
     *  remove only 1 value, if value get to 0 remove key,
     *  if item does not exist, it will be created with -1
     * @param item
     */

    public void useItem(Items item) {
        items.put(item, items.getOrDefault(item, 0) - 1);
        if(items.get(item) == 0) {
            items.remove(item);
        }
    }


    public void showInventory(){
        System.out.println("-".repeat(30));
        items.forEach((k,v)-> System.out.println(k +"  total:" + v));

    }

    public void manageInventory() {

    }
}
