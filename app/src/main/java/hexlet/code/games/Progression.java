package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final String TITLE = "What number is missing in the progression?";
    private static final int ATTEMPTS_COUNT = 3;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_START = 101;
    private static final int MAX_STEP = 5;

    public static void startGame() {
        String[][] gameData = new String[ATTEMPTS_COUNT][2];

        for (int i = 0; i < ATTEMPTS_COUNT; i++) {
            Random random = new Random();
            int[] array = new int[PROGRESSION_LENGTH];
            array[0] = random.nextInt(1, MAX_START);
            int numberSum = random.nextInt(1, MAX_STEP);
            for (int k = 1; k < PROGRESSION_LENGTH; k++) {
                array[k] = array[k - 1] + numberSum;
            }
            int randomIndex = random.nextInt(PROGRESSION_LENGTH);
            StringBuilder question = new StringBuilder();
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == randomIndex) {
                    question.append(".. ");
                } else {
                    question.append(array[j]).append(" ");
                }
            }
            gameData[i][1] = String.valueOf(array[randomIndex]);
            gameData[i][0] = question.toString();
        }
        Engine.game(TITLE, gameData);
    }
}
