package utils;

import java.util.Random;

public class Utils {
    
    
    public static int RNG(int min, int max)
    {
        Random random = new Random();
         return  random.nextInt(max - min) + min;
        //return number;
    }
}
