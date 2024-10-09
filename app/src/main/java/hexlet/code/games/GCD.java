package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtil;

public class GCD {
    private static final String TITLE = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 101;

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.game(TITLE, gameData);
    }

    private static String[][] generateGameData() {
        String[][] gameData = new String[Engine.getNumberOfRounds()][2];
        for (int i = 0; i < gameData.length; i++) {
            int number1 = RandomUtil.getRandomNumber(1, MAX_RANDOM_NUMBER);
            int number2 = RandomUtil.getRandomNumber(1, MAX_RANDOM_NUMBER);
            String question = number1 + " " + number2;
            String answer = String.valueOf(gcd(number1, number2));
            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        return gameData;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
