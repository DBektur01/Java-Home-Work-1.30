import java.util.Scanner;

public class Exercies23 {
    public static void main(String[] args) {
        /**
         * Напишите класс, который принимает с клавиатуры целое число,
         * которое должно означать порядковый номер месяца. В случае если
         * полученное
         * значение действительно соответствует порядковому номеру
         * одного из месяцев, следует вывести сезон (лето, осень, зима,
         * весна), к которому относится месяц.
         * В случае если введенное значение не является порядковым
         * номером месяца, следует вывести на экран соответствующее
         * текстовое сообщение.
         * */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a < 13 && a > 0) {
                if (a == 12 || a == 1 || a == 2) {
                    System.out.println("зима ");
                } else if (a == 3 || a == 4 || a == 5) {
                    System.out.println("весна");
                } else if (a == 6 || a == 7 || a == 8) {
                    System.out.println("лето");
                } else {
                    System.out.println("осень");
                }
            } else {
                System.out.println("\n1-12");
                break;
            }
        }
    }
}
