public class Main {
    public static void main(String[] args) {
    int[] array = {1,2,3,4,5};// 0 1 2 3 4
        int firstNum = array [0];

        // Смена первого и последнего элемента
        array [0] = array[array.length - 1];
        array[array.length - 1] = firstNum;

        int middleNum = array.length / 2;
        int sum = array[0] + array[middleNum];
        System.out.println("Результат суммы: " + sum);
    }
}