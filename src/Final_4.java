import java.util.Scanner;

public class Final_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        boolean hintUsed = false;

        while (attempt < 3) {
            System.out.print("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            } else if (attempt == 0 && answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Он скрыт в архиве и может нанести вред компьютеру.");
                hintUsed = true;
            } else if (hintUsed && answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна.");
            } else {
                System.out.println("Подумай еще!");
                attempt++;
            }
        }

        System.out.println("Обидно, приходи в другой раз");
    }
}