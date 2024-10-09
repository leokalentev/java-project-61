package hexlet.code.utils;

import java.util.Random;

public class RandomUtil {
    private static final Random RANDOM = new Random();

    public static int getRandomNumber(int upperBound) {
        return RANDOM.nextInt(upperBound);
    }

    public static int getRandomNumber(int lowerBound, int upperBound) {
        return RANDOM.nextInt(lowerBound, upperBound);
    }
}
