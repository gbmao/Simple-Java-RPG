package items;

import java.util.ArrayList;
import java.util.List;

//it is possible to connect playerBag with items?
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
