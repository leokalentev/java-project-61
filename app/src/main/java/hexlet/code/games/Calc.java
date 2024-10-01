package hexlet.code.games;

import hexlet.code.Engine;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Calc {
    private static String title = "What is the result of the expression?";

    public static void calcGame(String name) {
        int[] array = new int[100];
        String[] arrayZnak = {"+", "-", "*"};
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        String[] arrayQuestion = new String[3];
        String[] arrayAnswer = new String[3];
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomIndex1 = random.nextInt(array.length);
            int randomIndex2 = random.nextInt(array.length);
            int randomZnak = random.nextInt(arrayZnak.length);

            String question = String.valueOf(array[randomIndex1]) + " " + arrayZnak[randomZnak] + " "
                    + String.valueOf(array[randomIndex2]);
            int result = 0;

            if (arrayZnak[randomZnak].equals("+")) {
                result = array[randomIndex1] + array[randomIndex2];
            } else if (arrayZnak[randomZnak].equals("-")) {
                result = array[randomIndex1] - array[randomIndex2];
            } else if (arrayZnak[randomZnak].equals("*")) {
                result = array[randomIndex1] * array[randomIndex2];
            }
            arrayAnswer[i] = String.valueOf(result);
            arrayQuestion[i] = question;
            result = 0;
            question = "";
        }
        Engine.startGame(title, arrayQuestion, arrayAnswer, name);
    }
}
