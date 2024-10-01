package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void startGame(String title, String [] arrayQuestion, String [] arrayAnswer, String userName){
        System.out.println(title);
        int k=0;
        for (int i=0;i<3;i++){
            System.out.println("Question: " + arrayQuestion[i]);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            if (answer.equals(arrayAnswer[i])){
                System.out.println("Correct!");
                k+=1;
            }
            else {
                System.out.println("'"+ answer + "'"+ " is wrong answer ;(. Correct answer was " + "'" + arrayAnswer[i] + "'");
                System.out.println("Let's try again, "+ userName + "!");
                break;
            }
        }
        if (k==3){
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
