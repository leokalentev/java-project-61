package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtil;

public class Prime {
    private static final String TITLE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 51;
    private static final int[] PRIME_NUMBERS = {2, 3, 5, 7, 11, 17, 19, 23, 29, 31, 37, 41, 43, 47, 13};

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.game(TITLE, gameData);
    }

    private static String[][] generateGameData() {
        int numberOfRounds = Engine.getNumberOfRounds();
        String[][] gameData = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            String question = String.valueOf(RandomUtil.getRandomNumber(1, MAX_RANDOM_NUMBER));
            String answer = "";
            for (int j = 0; j < PRIME_NUMBERS.length; j++) {
                if (PRIME_NUMBERS[j] != Integer.parseInt(question)) {
                    answer = "no";
                } else {
                    answer = "yes";
                    break;
                }
            }
            gameData[i][1] = answer;
            gameData[i][0] = question;
        }
        return gameData;
    }
}
