import java.util.Scanner;

public class Exercies2 {
    public static void main(String[] args) {
/**
 * Сиздер консольдон 2 орундуу сан киргизишиниздер керек, ошол
 * санды сиздер математикалык турдоо консольго чыгарышыныздар
 * керек
 * Мисалы:

 * Input: 34
 * Output: 30 + 4

 * Input: 49
 * Output: 40 + 9
 * */
       Scanner scanner = new Scanner(System.in);
       int num=scanner.nextInt();

       int a=num/10*10;
       int b=num%10;
        System.out.println("Output: "+a+" + "+b);
    }
}
