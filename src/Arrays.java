public class Arrays {

    public static void main(String[] args) {
    int[] num = {1,2,3,4,5};// 0 1 2 3 4
        int firstNum = num [0];
        num [0] = num[num.length - 1];
        num[num.length - 1] = firstNum;
        // Смена первого и последнего элемента

        System.out.println(num[0] + num.length/2);
    }
}
