package database;

import locations.Locations;
import utils.Utils;

public class GameLocations {


//    public static Locations actualRoom = new Locations(name(), light(), size());

    public static String roomDescription(){

        return name() +size()+ light();
    }

    public static String size(){

        return switch(Utils.RNG(1, 3)){
            case 1 -> " big room";
            case 2 -> " small room";
            case 3 -> " strange room";
            default -> " room";
        };
    }
    public static String light(){

        return switch(Utils.RNG(1, 3)){
            case 1 -> " with the sun light coming from a little window";
            case 2 -> " with a simple torch lighting the place.";
            case 3 -> " with some lifted candles";
            default -> " with no light source";
        };
    }
    public static String name(){

        return switch(Utils.RNG(1, 3)){
            case 1 -> " strange";
            case 2 -> " mysterious";
            case 3 -> " golden";
            default -> " simple";
        };
    }
}

// create
