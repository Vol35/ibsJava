import java.util.Random;

public class Data_4 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();

        // Заполнение массива рандомными значениями от -20 до 20
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(41) - 20;
        }

        System.out.println("Массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Максимальный элемент: " + max);

        System.out.println("Минимальный элемент: " + min);

        int maxAbsoluteValue = Math.max(Math.abs(max), Math.abs(min));

        System.out.println("Наибольшее по модулю значение: " + maxAbsoluteValue);
    }
}
