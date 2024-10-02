package hexlet.code.games;

import hexlet.code.Engine;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public class Even {
    private static String title = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {
        String[][] gameData = new String[3][2];

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(1, 101);
            String question = String.valueOf(randomNumber);
            String answer = "";
            if (randomNumber % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        Engine.game(title, gameData);
    }
}
