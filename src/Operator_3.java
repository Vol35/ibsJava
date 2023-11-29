import java.util.Scanner;
public class Operator_3 {
    public static void main(String[] args) {
        int choice;
        int choice1;
        int choice2 = 0;
        double amount;

        Scanner sc = new Scanner(System.in);
        System.out.print("Выберете, что переводить 1 - Масса, 2 - Расстояние:  ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Выберите единицу измерения 1 - грамм, 2 - кг, 3 - тонна: ");
            choice1 = sc.nextInt();
        } else if (choice == 2) {
            System.out.print("Выберите единицу измерения 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
            choice2 = sc.nextInt();
        } else {
            System.out.print("Неверный ввод, введите 1 или 2");
        }
        System.out.print("Введите количество единиц: ");
        amount = sc.nextDouble();

        switch (choice2) {
            case 1:
                System.out.println("Результат: " +
                        "\n" + "Метры: " + amount +
                        "\n" + "Мили: " + amount * 1609.34 +
                        "\n" + "Ярды: " + amount * 1.09361 +
                        "\n" + "Футы: " + amount * 3.28083);
                break;
            case 2:
                System.out.println("Результат: " +
                        "\n" + "Метры: " + amount * 1609.34 +
                        "\n" + "Мили: " + amount +
                        "\n" + "Ярды: " + amount * 1760 +
                        "\n" + "Футы: " + amount * 5280);
                break;
            case 3:
                System.out.println("Результат: " +
                        "\n" + "Метры: " + amount * 0.914 +
                        "\n" + "Мили: " + amount * 0.00057 +
                        "\n" + "Ярды: " + amount +
                        "\n" + "Футы: " + amount * 3);
                break;
            case 4:
                System.out.println("Результат: " +
                        "\n" + "Метры: " + amount * 0.3048 +
                        "\n" + "Мили: " + amount * 0.00019 +
                        "\n" + "Ярды: " + amount * 0.33 +
                        "\n" + "Футы: " + amount);
                break;
            //  Аналогично поступаем с выбором choice1 (Масса).
        }
    }
}

