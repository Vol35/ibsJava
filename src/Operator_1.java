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
        double delenie = avg/2;
        double result = (double) Math.floor(delenie);
        //System.out.println(result); округление delenie

        if (result >3)

            System.out.println("Программа выполнена корректно");
        else {
            System.out.println("Что то пошло не так :(");
        }


    }
}
