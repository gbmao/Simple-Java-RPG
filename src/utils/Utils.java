package utils;

import characters.CombatGroup;
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

    public static void dropRandomItem(Items item, double dropRate){
        if (Utils.RNG(dropRate)){
            System.out.println("you found :" + item);
            GameItems.addItem(item, 1);
        }
    }


    public static Enemies enemiesGeneration(int playerLevel, int roomNumber) {


        if (roomNumber == 10) {
            return new Enemies("Giant Spider", 12, 4, 150, GameItems.hpPotion, 0.9);
        }

        if (playerLevel < 3) {
            return new CombatGroup().slime;
        } else if (playerLevel < 5) {
            return new CombatGroup().skeletonArcher;
        } else {
            return new CombatGroup().skeletonArcher;
        }

    }


}
