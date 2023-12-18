import java.util.Scanner;

public class Final_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        String maxString = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();

            if (input.length() > maxString.length()) {
                maxString = input;
            }
        }

        System.out.println("Ответ: " + maxString);
    }
}