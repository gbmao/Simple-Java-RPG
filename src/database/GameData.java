package database;

import locations.Locations;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;


public class GameData {


//TODO create array (or list) to store random texts to describe the rooms(with more life)
    public static String roomDescription() {

        Locations room = new Locations(name(), light(), size());
        return "You entered an " + room.getName()+ room.getSize() + room.getLight() ;
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
    public static List<String> create() {

        List<String> initialChoices = new ArrayList<>();

        initialChoices.add("- Attack!  ");
        initialChoices.add("- Enter next room");
        return initialChoices;
    }

    public static List<String> battleOptions(){

        List<String> battleOptions = new ArrayList<>();

        battleOptions.add("- Attack!!!");
        battleOptions.add("Magic(not implemented)");
        battleOptions.add("Use Item(not implemented");
        battleOptions.add("RUN(not implemented)");
        return battleOptions;
    }
}

// create
