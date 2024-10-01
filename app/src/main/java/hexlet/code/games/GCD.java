package hexlet.code.games;

import hexlet.code.Engine;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class GCD {
    private static String title = "Find the greatest common divisor of given numbers.";
    public static void gameGCD(String userName) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        String[] arrayQuestion = new String[3];
        String[] arrayAnswer = new String[3];

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomIndex1 = random.nextInt(array.length);
            int randomIndex2 = random.nextInt(array.length);
            String question = String.valueOf(array[randomIndex1]) + " " + String.valueOf(array[randomIndex2]);
            String answer = "";
            if (array[randomIndex1] > array[randomIndex2]) {
                while (array[randomIndex2] != 0) {
                    int temp = array[randomIndex2];
                    array[randomIndex2] = array[randomIndex1] % array[randomIndex2];
                    array[randomIndex1] = temp;
                }
                answer = String.valueOf(array[randomIndex1]);
            } else {
                while (array[randomIndex1] != 0) {
                    int temp = array[randomIndex1];
                    array[randomIndex1] = array[randomIndex2] % array[randomIndex1];
                    array[randomIndex2] = temp;
                }
                answer = String.valueOf(array[randomIndex2]);
            }

            arrayQuestion[i] = question;
            arrayAnswer[i] = answer;
            question = "";
            answer = "";
        }
        Engine.startGame(title, arrayQuestion, arrayAnswer, userName);
    }
}
