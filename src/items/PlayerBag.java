package items;

import java.util.ArrayList;
import java.util.List;

//TODO recriate bag to something simple
// something that just keep a simple counting++ ?????

public class PlayerBag {
    private static  List<Items> item;

    public PlayerBag(){
        item = new ArrayList<>();
    }



    public static void addItem(Items items){
        item.add(items);
    }
    public List<Items> getItems() {
        return item;
    }

}
