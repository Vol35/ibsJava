import java.util.Scanner;

public class Final_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();

        char[] equationArray = equation.toCharArray();

        int xPosition = -1;
        int operand1 = -1;
        int operand2 = -1;
        char operator = ' ';

        for (int i = 0; i < equationArray.length; i++) {
            if (equationArray[i] == 'x') {
                xPosition = i;
            } else if (Character.isDigit(equationArray[i])) {
                if (operand1 == -1) {
                    operand1 = Character.getNumericValue(equationArray[i]);
                } else {
                    operand2 = Character.getNumericValue(equationArray[i]);
                }
            } else if (equationArray[i] == '+' || equationArray[i] == '-') {
                operator = equationArray[i];
            }
        }

        int result;

        switch (xPosition) {
            case 0:
                if (operator == '+') {
                    result = operand2 - operand1;
                } else {
                    result = operand1 - operand2;
                }
                break;
            case 2:
                if (operator == '+') {
                    result = operand2 - operand1;
                } else {
                    result = operand1 - operand2;
                }
                break;
            case 4:
                if (operator == '+') {
                    result = operand1 + operand2;
                } else {
                    result = operand1 - operand2;
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid equation format.");
        }

        System.out.println("Решение уравнения: x = " + result);
    }
}