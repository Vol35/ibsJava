import java.util.Scanner;

public class Data_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int latinWordCount = 0;

        System.out.println("Слова, состоящие только из латиницы:");

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                latinWordCount++;
            }
        }

        System.out.println("Количество слов, состоящих только из латиницы: " + latinWordCount);
    }
}