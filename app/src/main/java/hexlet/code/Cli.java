package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetingUser(){
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, "+ name+ "!");
    }
}
