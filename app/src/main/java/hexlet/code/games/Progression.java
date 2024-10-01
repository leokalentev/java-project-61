package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static String title = "What number is missing in the progression?";
    public static void gameProgression(String userName){
        String [] arrayQuestion = new String[3];
        String [] arrayAnswer = new String[3];

        for (int i=0;i<3;i++){
            Random random = new Random();
            int [] array=new int [10];
            array[0]=random.nextInt(1,100);
            int numberSum=random.nextInt(1,5);
            for (int k=1;k<10;k++){
                array[k]=array[k-1]+numberSum;
            }
            int randomIndex=random.nextInt(10);
            String question="";
            String answer="";
            for (int j=0;j<10;j++){
                if (j==randomIndex){
                    question += ".. ";
                }
                else{
                    question += String.valueOf(array[j]) + " ";
                }
            }
            arrayAnswer[i]=String.valueOf(array[randomIndex]);
            arrayQuestion[i]=question;
        }
        Engine.startGame(title,arrayQuestion,arrayAnswer,userName);
    }
}
