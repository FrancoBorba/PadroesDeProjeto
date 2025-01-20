package creational.factoryMethod.util;

import java.util.Random;

public class NumerosRandons {
    private static final Random random = new Random();

    public static int getRandomNumber(int max) {
        return random.nextInt(max);
    }
}
