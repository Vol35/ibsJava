import java.util.Scanner;
public class Cycle_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 4;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int length = in.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i] == x | array[i] == y | array[i] == z )
                System.out.println("Данное значение имеется в константах");

        }
    }
}
