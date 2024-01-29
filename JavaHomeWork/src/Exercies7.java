import java.util.Scanner;

public class Exercies7 {
    public static void main(String[] args) {
        /**
         * Биз клавиатурадан 3 орундуу сан беребиз, ошол сандын ар бир
         * орундагы сандарынын суммасыны табышыбыз керек.

         * Мисалы:

         * Input: 359
         * Output: 3 + 5 + 9 = 17

         * Input: 409
         * Output: 4 + 0 + 9 = 13
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("3 орунду сан жазыныз: ");
        int num=scanner.nextInt();
        int a=num%10;
        num/=10;
        int b=num%10;

        int c=num/=10;

        int result=c+b+a;

        System.out.println("Output: "+c+" + "+b+" + "+a+" = "+result);
    }
}
