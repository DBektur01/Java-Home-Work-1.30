import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Сиздер консольдон уч орундуу сан бересиздер, ошол санды
         * сиздер наобороттун чыгарып жана ортосунан болуп салышынздар
         * керек
         * Мисалы:
         * Input:  457
         * Output: 7 5 4  с
         * */

        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int a=num%10;
        int b=num/10%10;
        int c=num/100;

        System.out.println(a+" "+b+" "+c);
    }
}