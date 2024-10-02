package hexlet.code.games;

import hexlet.code.Engine;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class GCD {
    private static String title = "Find the greatest common divisor of given numbers.";
    public static void startGame() {
        String[][] gameData = new String[3][2];

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber1 = random.nextInt(1, 101);
            int randomNumber2 = random.nextInt(1, 101);
            String question = String.valueOf(randomNumber1) + " " + String.valueOf(randomNumber2);
            String answer = "";
            if (randomNumber1 > randomNumber2) {
                while (randomNumber2 != 0) {
                    int temp = randomNumber2;
                    randomNumber2 = randomNumber1 % randomNumber2;
                    randomNumber1 = temp;
                }
                answer = String.valueOf(randomNumber1);
            } else {
                while (randomNumber1 != 0) {
                    int temp = randomNumber1;
                    randomNumber1 = randomNumber2 % randomNumber1;
                    randomNumber2 = temp;
                }
                answer = String.valueOf(randomNumber2);
            }
            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        Engine.game(title, gameData);
    }
}
