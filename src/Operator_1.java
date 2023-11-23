import java.util.Scanner;
public class Operator_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double x = sc.nextDouble();
        System.out.print("Введите число: ");
        double y = sc.nextDouble();
        System.out.print("Введите число: ");
        double z = sc.nextDouble();
        double avg = (x+y+z)/3;
        System.out.println("Среднее арифметическое = " + avg);
        double delimNaDva = avg/2;
        int result = (int)Math.floor(delimNaDva);
        if (delimNaDva>3)
            System.out.println("Программа выполнена корректно");
        else {
            System.out.println("Что то пошло не так :(");
        }


    }
}
