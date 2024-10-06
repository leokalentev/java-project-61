package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    private static final int GREET_GAME_NUMBER = 1;
    private static final int EVEN_GAME_NUMBER = 2;
    private static final int CALC_GAME_NUMBER = 3;
    private static final int GCD_GAME_NUMBER = 4;
    private static final int PROGRESSION_GAME_NUMBER = 5;
    private static final int PRIME_GAME_NUMBER = 6;
    private static final int EXIT_GAME_NUMBER = 0;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_GAME_NUMBER + " - Greet");
        System.out.println(EVEN_GAME_NUMBER + " - Even");
        System.out.println(CALC_GAME_NUMBER + " - Calc");
        System.out.println(GCD_GAME_NUMBER + " - GCD");
        System.out.println(PROGRESSION_GAME_NUMBER + " - Progression");
        System.out.println(PRIME_GAME_NUMBER + " - Prime");
        System.out.println(EXIT_GAME_NUMBER + " - Exit");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        int numberChoice = in.nextInt();
        switch (numberChoice) {
            case GREET_GAME_NUMBER:
                Cli.greetingUser();
                break;
            case EVEN_GAME_NUMBER:
                Even.startGame();
                break;
            case CALC_GAME_NUMBER:
                Calc.startGame();
                break;
            case GCD_GAME_NUMBER:
                GCD.startGame();
                break;
            case PROGRESSION_GAME_NUMBER:
                Progression.startGame();
                break;
            case PRIME_GAME_NUMBER:
                Prime.startGame();
                break;
            default:
                break;
        }
    }
}
