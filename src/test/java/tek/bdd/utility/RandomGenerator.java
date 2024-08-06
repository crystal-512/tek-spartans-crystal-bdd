package tek.bdd.utility;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(characters.charAt(random.nextInt(characters.length())));}
        return stringBuilder.toString();

    }
}
