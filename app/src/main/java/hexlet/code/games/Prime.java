package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String TITLE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int ATTEMPTS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 51;
    private static final int[] PRIME_NUMBERS = {2, 3, 5, 7, 11, 17, 19, 23, 29, 31, 37, 41, 43, 47, 13};

    public static void startGame() {
        String[][] gameData = new String[ATTEMPTS_COUNT][2];

        for (int i = 0; i < ATTEMPTS_COUNT; i++) {
            Random random = new Random();
            String question = String.valueOf(random.nextInt(1, MAX_RANDOM_NUMBER));
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

        Engine.game(TITLE, gameData);
    }
}
