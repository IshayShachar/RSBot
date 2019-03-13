package Chopper.Utils;

import java.util.Random;

/**
 * A class for random actions utils (such as random sleep)
 */
public class RandomUtil {
    public static long getRandomSleepInMS(int lower, int upper){
        Random rnd = new Random();
        return (long) (rnd.nextInt((upper - lower) + 1) + lower);
    }
}
