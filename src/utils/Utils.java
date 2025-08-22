package utils;

import characters.Enemies;

import java.util.Random;

public class Utils {
    
    
    public static int RNG(int min, int max)
    {
        Random random = new Random();
         return  random.nextInt(max - min) + min;
        //return number;
    }

    public static Enemies enemiesGeneration(int playerLevel, int roomNumber) {

        if (roomNumber == 10) {
            return  new Enemies("Giant Spider", 12, 4, 150);
        }

        if (playerLevel < 3) {
            return  new Enemies("Slime", 5, 1, 30);
        } else if (playerLevel < 5) {
            return  new Enemies("Skeleton Warrior", 7, 3, 60);
        } else {
            return  new Enemies("Skeleton Archer", 4, 4, 70);
        }

    }


}
