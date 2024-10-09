package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtil;

public class Progression {
    private static final String TITLE = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_START = 101;
    private static final int MAX_STEP = 5;

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.game(TITLE, gameData);
    }

    public static String[][] generateGameData() {
        int numberOfRounds = Engine.getNumberOfRounds();
        String[][] gameData = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            int start = RandomUtil.getRandomNumber(1, MAX_START);
            int step = RandomUtil.getRandomNumber(1, MAX_STEP);
            int hiddenIndex = RandomUtil.getRandomNumber(PROGRESSION_LENGTH);

            int[] progression = generateProgression(start, step);
            String question = "";
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == hiddenIndex) {
                    question += ".. ";
                } else {
                    question += progression[j] + " ";
                }
            }

            gameData[i][0] = question;
            gameData[i][1] = String.valueOf(progression[hiddenIndex]);
        }
        return gameData;
    }

    public static int[] generateProgression(int start, int step) {
        int[] progression = new int[PROGRESSION_LENGTH];
        progression[0] = start;
        for (int i = 1; i < PROGRESSION_LENGTH; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }
}
