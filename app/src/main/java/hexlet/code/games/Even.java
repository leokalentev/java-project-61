package hexlet.code.games;

import hexlet.code.Engine;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public class Even {
    private static String title = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenNumbersGame(String name){
        int [] array= new int [100];
        for (int i=0; i< array.length; i++){
            array[i]=i+1;
        }

        String [] arrayQuestion = new String[3];
        String [] arrayAnswer = new String[3];

        for (int i=0; i<3;i++){
            Random random = new Random();
            int randomIndex=random.nextInt(array.length);
            String question = String.valueOf(array[randomIndex]);
            String answer = "";
            if (array[randomIndex]%2==0 ){
                answer="yes";
            }
            else if (array[randomIndex]%2!=0){
                answer="no";
            }
            arrayQuestion[i]=question;
            arrayAnswer[i]=answer;
            question="";
            answer="";
        }
        Engine.startGame(title,arrayQuestion,arrayAnswer,name);
    }
}
