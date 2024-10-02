package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void game(String title, String[][] questionAndAnswer) {
        System.out.println();
        String userName = Cli.greetingUser();
        System.out.println(title);
        int correctAnswers = 0;

        for (int i = 0; i < questionAndAnswer.length; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();

            if (answer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + questionAndAnswer[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (correctAnswers == questionAndAnswer.length) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
