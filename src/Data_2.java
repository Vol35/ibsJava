public class Data_2 {
    public static void main(String[] args) {
        String str = "I like Java!!!";


        boolean containsJava = str.contains("Java");
        System.out.println("Содержит подстроку 'Java': " + containsJava);


        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается с подстроки 'I like': " + startsWithILike);


        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается на подстроку '!!!': " + endsWithExclamation);


        if (containsJava && startsWithILike && endsWithExclamation) {
            String uppercaseStr = str.toUpperCase();
            System.out.println("Преобразованная строка в верхнем регистре: " + uppercaseStr);
        }

        String replaced = str.replace('a', 'o');
        String Jovo = replaced.substring(7, 11);
        System.out.println("Подстрока 'Jovo': " + Jovo);
    }
}
