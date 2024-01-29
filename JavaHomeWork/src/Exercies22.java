import java.util.Scanner;

public class Exercies22 {
    public static void main(String[] args) {
        /**
         * 22. Назовем билет с шестизначным номером «счастливым», если
         сумма первых трех его цифр равна сумме последних трех его цифр
         и обе эти суммы являются четными.
         Напишите класс, который принимает с клавиатуры шестизначный
         номер билета и проверяет, является ли он «счастливым» или не
         является.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("6 орунду сан жазыныз: ");

        int num = scanner.nextInt();
        int a = num / 100000 % 10;
        int b = num / 10000 % 10;
        int c = num / 1000 % 10;
        int d = num / 100 % 10;
        int e = num / 10 % 10;
        int f = num% 10;


        if (a+b+c % 2 == 0 && d+e+f % 2 == 0 &&
                (a + b + c) == (d + e + f)) {
            System.out.println("Этот билет счастливый!");
        } else {
            System.out.println("Этот билет не счастливый.");
        }
    }
}
