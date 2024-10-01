package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        int numberChoice = in.nextInt();
        if (numberChoice == 1) {
            System.out.println();
            Cli.greetingUser();
        } else if (numberChoice == 2) {
            System.out.println();
            String userName = Cli.greetingUser();
            Even.evenNumbersGame(userName);
        } else if (numberChoice == 3) {
            System.out.println();
            String userName = Cli.greetingUser();
            Calc.calcGame(userName);
        } else if (numberChoice == 4) {
            System.out.println();
            String userName = Cli.greetingUser();
            GCD.gameGCD(userName);
        } else if (numberChoice == 5) {
            System.out.println();
            String userName = Cli.greetingUser();
            Progression.gameProgression(userName);
        } else if (numberChoice == 6) {
            System.out.println();
            String userName = Cli.greetingUser();
            Prime.gamePrime(userName);
        }
    }
}
