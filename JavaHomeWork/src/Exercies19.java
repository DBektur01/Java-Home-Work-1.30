import java.util.Scanner;

public class Exercies19 {
    public static void main(String[] args) {
        /**
         * 19. Трехзначное число называется «дважды четным», если и оно
         * само, и сумма его цифр - четные.
         * Напишите класс, который принимает с клавиатуры трехзначное
         * положительное число и проверяет, является ли оно «дважды
         * четным». В соответствии с результатом проверки надо вывести на
         * экран соответствующее
         * текстовое сообщение.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 орунду сан жазыныз: ");
        int number=scanner.nextInt();

        int a=number/100;
        int b=number%100/10;
        int c=number%10;
        int res=a+b+c;
        if(a%2==0 && b%2==0 && c%2==0 && res%2==0){

            System.out.println("дважды четным\n"+a+" + "+b+" + "+c+" = "+res);
        }else {
            System.out.println("Error");

        }
    }
}
