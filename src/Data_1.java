import java.util.Scanner;

public class Data_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String strNum1 = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        double doubleNum1 = Double.parseDouble(strNum1);

        if (doubleNum1 > num2) {
            System.out.println("Большее число: " + doubleNum1);
        } else if (num2 > doubleNum1) {
            System.out.println("Большее число: " + num2);
        } else {
            System.out.println("Числа равны");
        }

        double smallerNum1 = Math.min(doubleNum1, num2);
        System.out.println("Меньшее число: " + smallerNum1);;

    }
}
