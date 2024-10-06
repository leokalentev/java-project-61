package hexlet.code.games;

import hexlet.code.Engine;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public class Even {
    private static String title = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int ATTEMPTS = 3;
    private static final int MAX_RANDOM_NUMBER = 101;

    public static void startGame() {
        String[][] gameData = new String[ATTEMPTS][2];

        for (int i = 0; i < ATTEMPTS; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(1, MAX_RANDOM_NUMBER);
            String question = String.valueOf(randomNumber);
            String answer = (randomNumber % 2 == 0) ? "yes" : "no";
            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        Engine.game(title, gameData);
    }
}
