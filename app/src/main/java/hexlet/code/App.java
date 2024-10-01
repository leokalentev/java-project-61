package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        int numberChoice=in.nextInt();
        if (numberChoice==1){
            System.out.println();
            Cli.greetingUser();
        }
        else if (numberChoice==2){
            System.out.println();
            String userName= Cli.greetingUser();
            Even.evenNumbersGame(userName);
        }
    }
}
