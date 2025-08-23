package database;

import characters.Player;
import items.Items;
import locations.Locations;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class GameData {


    //TODO create array (or list) to store random texts to describe the rooms(with more life)
    public static String roomDescription() {

        Locations room = new Locations(name(), light(), size());
        return "You entered an " + room.getName() + room.getSize() + room.getLight();
    }


    public static String size() {

        return switch (Utils.RNG(1, 3)) {
            case 1 -> " big room";
            case 2 -> " small room";
            case 3 -> " strange room";
            default -> " room";
        };
    }

    public static String light() {

        return switch (Utils.RNG(1, 3)) {
            case 1 -> " with the sun light coming from a little window";
            case 2 -> " with a simple torch lighting the place.";
            case 3 -> " with some lifted candles";
            default -> " with no light source";
        };
    }

    public static String name() {

        return switch (Utils.RNG(1, 3)) {
            case 1 -> " strange";
            case 2 -> " mysterious";
            case 3 -> " golden";
            default -> " simple";
        };
    }

    //place to populate all the input
    public static List<String> roomChoices() {

        List<String> initialChoices = new ArrayList<>();

        initialChoices.add("- Attack!  ");
        initialChoices.add("- Enter next room");
        return initialChoices;
    }

    public static List<String> battleChoices() {

        List<String> battleChoices = new ArrayList<>();

        battleChoices.add("- Attack!!!");
        battleChoices.add("Magic(not implemented)");
        battleChoices.add("Use Item(not implemented");
        battleChoices.add("RUN(not implemented)");
        return battleChoices;
    }

    public static List<String> InventoryChoices(Map<Items, Integer> map) {

        String item = "";

        List<String> inventoryChoices = new ArrayList<>();
        for (Map.Entry<Items, Integer> entry : map.entrySet()) {
            item = entry.getKey().getName() + " x" + entry.getValue();
            inventoryChoices.add(item);
        }
        return inventoryChoices;
    }

    public static void showInventory(Map<Items, Integer> map) {
        System.out.println("-".repeat(10));
        System.out.println(Player.player1.getName() + " Inventory ");

        for (Map.Entry<Items, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey().getName() + " x" + entry.getValue());
        }
        System.out.println("-".repeat(10));
    }

}

// create
