import characters.Enemies;
import characters.Player;

import database.GameData;
import database.GameItems;
import interfaces.Menu;
import items.HealingPotions;
import utils.Utils;
import world.GameWorld;

public class Game {
    public static void main(String[] args) {


//        Utils.initialChoices.add("teste");
        interfaces.Menu menu = new Menu();
//        Menu menu = new Menu();
        //criar um metodo para criar players
        Player p1 = new Player();
        GameWorld world = new GameWorld(p1);
        menu.menu(p1, world);



    }

}
