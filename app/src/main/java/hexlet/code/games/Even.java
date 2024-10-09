package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public class Even {
    private static final String TITLE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 101;

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.game(TITLE, gameData);
    }

    public static String[][] generateGameData() {
        int numberOfRounds = Engine.getNumberOfRounds();
        String[][] gameData = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            int randomNumber = RandomUtil.getRandomNumber(1, MAX_RANDOM_NUMBER);
            String question = String.valueOf(randomNumber);
            String answer = (randomNumber % 2 == 0) ? "yes" : "no";
            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        return gameData;
    }
}
