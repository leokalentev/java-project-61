package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenNumbersGame(String name){
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int [] array= new int [100];
        for (int i=0; i< array.length; i++){
            array[i]=i+1;
        }
        int k=0;
        for (int i=0; i<3;i++){
            Random random = new Random();
            int randomIndex=random.nextInt(array.length);
            System.out.println("Question: " + array[randomIndex]);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            if (array[randomIndex]%2==0 && answer.equals("no")){
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, "+ name + "!");
                k=0;
                break;
            }
            else if (array[randomIndex]%2!=0 && answer.equals("yes")){
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, "+ name + "!");
                k=0;
                break;
            }
            else if ((array[randomIndex]%2==0 && answer.equals("yes") || (array[randomIndex]%2!=0 && answer.equals("no")))){
                System.out.println("Correct!");
                k+=1;
            }
        }
        if (k==3){
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
