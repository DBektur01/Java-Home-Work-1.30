import java.util.Scanner;

public class Exercies4 {
    public static void main(String[] args) {
        /**
         * Сиздер консольдон 3 орундуу сан киргизишиниздер керек, ошол
         * санды сиздер математикалык турдоо консольго чыгарышыныздар
         * керек
         * Мисалы:
         * Input: 364
         * Output: 300 + 60 + 4
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("3 орунду сан жазыныз: ");
        int num=scanner.nextInt();
        int a=num%10;
        num/=10;
        int b=num%10;
        num/=10;
        int c=num;
        System.out.println("Output: "+c*100+"+"+b*10+"+"+a);

    }
}
