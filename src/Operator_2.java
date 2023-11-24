import java.util.Scanner;
public class Operator_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число:  ");
            double num1 = sc.nextDouble();
        System.out.print("Введите второе число:  ");
            double num2 = sc.nextDouble();
        System.out.print("Введите символ (+, -, *, /): ");
        char symbol = sc.next ().charAt (0);
            double answer;
                switch (symbol){
                    case '+': answer = num1 + num2;
                        System.out.println("Результат = " + answer);
                        break;
                    case '-': answer = num1 - num2;
                        System.out.println("Результат = " + answer);
                        break;
                    case '*': answer = num1 * num2;
                        System.out.println("Результат = " + answer);
                        break;
                    case '/': answer = num1 / num2;
                        System.out.println("Результат = " + answer);
                        break;
                    default:
                        System.out.println("Ошибка");
                }
    }

}
