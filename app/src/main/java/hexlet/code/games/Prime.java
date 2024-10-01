package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static String title = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void gamePrime(String userName) {
        String[] arrayQuestion = new String[3];
        String[] arrayAnswer = new String[3];

        int[] array = {2, 3, 5, 7, 11, 17, 19, 23, 29, 31, 37, 41, 43, 47, 13};

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            String question = String.valueOf(random.nextInt(1, 51));
            String answer = "";
            for (int j = 0; j < array.length; j++) {
                if (array[j] != Integer.parseInt(question)) {
                    answer = "no";
                } else {
                    answer = "yes";
                    break;
                }
            }
            arrayAnswer[i] = answer;
            arrayQuestion[i] = question;
            question = "";
            answer = "";
        }

        Engine.startGame(title, arrayQuestion, arrayAnswer, userName);
    }
}
