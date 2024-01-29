import java.util.Scanner;

public class Exercies21 {
    public static void main(String[] args) {
        /**
         * Напишите класс, который принимает с клавиатуры
         * положительное целое число и выводит на экран ближайшее к нему
         * «крутлое число».
         * Например, для введенного значения 433 выводится на экран 430, а
         * для 56 выводится 60.
         * */
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int round=(int)(Math.round(num/10.0)*10);
        System.out.println(round);

    }
}
