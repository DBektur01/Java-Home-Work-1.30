import java.util.Scanner;

public class Exercies16 {
    public static void main(String[] args) {
        /**
         * Напишите программу, который принимает с клавиатуры целое
         * число и выводит на экран его квадрат, но только в случае, если
         * введенное число отрицательно. В противном случае - на экран
         * выводится сообщение Ошибка
         * */

        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if (number > 0) {
            System.out.println(Math.pow(number,2));
        }else{
            System.out.println(" Error");
        }
    }
}
