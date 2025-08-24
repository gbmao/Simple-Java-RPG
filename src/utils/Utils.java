package utils;

import characters.Enemies;

import database.GameItems;
import items.HealingPotions;
import items.Items;

import java.util.Random;

public class Utils {

    /**
     * @param chance insert the % you want in double(ie: 0.8 == 80%)
     */
    public static boolean RNG(double chance) {

        return (chance <= Math.random());
        //return number;
    }


    public static Enemies enemiesGeneration(int playerLevel, int roomNumber) {

        if (roomNumber == 10) {
            return new Enemies("Giant Spider", 12, 4, 150);
        }

        if (playerLevel < 3) {
            return null;
        } else if (playerLevel < 5) {
            return new Enemies("Skeleton Warrior", 7, 3, 60);
        } else {
            return new Enemies("Skeleton Archer", 4, 4, 70);
        }

    }


}
