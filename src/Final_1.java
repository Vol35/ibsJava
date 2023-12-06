import java.util.Scanner;
public class Final_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Количество рублей: ");
        int rubles = scanner.nextInt();

        double dollars = rubles / exchangeRate;

        double roundedDollars = Math.round(dollars * 100.0) / 100.0;
        System.out.println("Итого: " + roundedDollars);
    }
}