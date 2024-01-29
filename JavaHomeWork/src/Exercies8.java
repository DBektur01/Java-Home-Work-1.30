import java.util.Scanner;

public class Exercies8 {
    public static void main(String[] args) {
        /**
         * Напишите программу, который принимает с клавиатуры целое
         * число и, если оно положительное, увеличивает его вдвое. Класс
         * должен выводить на экран новое значение.
         * Мисалы:
         * Input: 4
         * Output: 8

         * Input: -5
         * Output: -5
         */
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if(number>0){
            number+=number;
            System.out.println(number);
        }else {
            System.out.println(number);
        }
    }
}
