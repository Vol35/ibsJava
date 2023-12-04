import java.util.Scanner;

public class Cycle_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int columns = scanner.nextInt();


        double[][] matrix = new double[rows][columns];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Первая строка матрицы, умноженная на 3:");
        for (int j = 0; j < columns; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}