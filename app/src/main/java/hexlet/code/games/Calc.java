package hexlet.code.games;

import hexlet.code.Engine;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Calc {
    private static String title = "What is the result of the expression?";
    private static final int ATTEMPTS = 3;
    private static final int MAX_RANDOM_NUMBER = 101;

    public static void startGame() {
        String[] arrayZnak = {"+", "-", "*"};
        String[][] gameData = new String[ATTEMPTS][2];
        for (int i = 0; i < ATTEMPTS; i++) {
            Random random = new Random();
            int num1 = random.nextInt(1, MAX_RANDOM_NUMBER);
            int num2 = random.nextInt(1, MAX_RANDOM_NUMBER);
            int randomZnak = random.nextInt(arrayZnak.length);

            String question = String.valueOf(num1) + " " + arrayZnak[randomZnak] + " "
                    + String.valueOf(num2);

            int result = switch (arrayZnak[randomZnak]) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                default -> 0;
            };
            gameData[i][1] = String.valueOf(result);
            gameData[i][0] = question;
        }
        Engine.game(title, gameData);
    }
}
