package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calc {
    private static final String TITLE = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER = 101;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.game(TITLE, gameData);
    }

    public static String[][] generateGameData() {
        int numberOfRounds = Engine.getNumberOfRounds();
        String[][] gameData = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            int num1 = RandomUtil.getRandomNumber(1, MAX_RANDOM_NUMBER);
            int num2 = RandomUtil.getRandomNumber(1, MAX_RANDOM_NUMBER);
            String operator = getRandomOperator();

            String question = num1 + " " + operator + " " + num2;
            String answer = String.valueOf(calculateResult(num1, num2, operator));

            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        return gameData;
    }

    private static String getRandomOperator() {
        return OPERATORS[RandomUtil.getRandomNumber(OPERATORS.length)];
    }

    private static int calculateResult(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> 0;
        };
    }
}
