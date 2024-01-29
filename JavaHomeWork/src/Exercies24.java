import java.util.HashSet;
import java.util.Scanner;


public class Exercies24 {
    public static void main(String[] args) {
        /**
         * 24. Напишите класс, который принимает с клавиатуры
         * положительное трехзначное число и проверяет, сколько разных
         * цифр оно содержит.
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 орунду сан жазыныз: ");

        int num = scanner.nextInt();
        int a=num/100;
        int b=num/10%10;
        int c=num%10;
        if (num>99 && num<1000){


            if (a==b && b==c ){
                System.out.println("Содержит 1 разных цифр");
            }
            else if (a==b || b==c || c==a ){
                System.out.println("Содержит 2 разных цифр ");
            }
            else  {
                System.out.println("3 разных цифр");
            }
        }


        else {
            System.out.println("Должен быть 3 значное число!");
        }





    }
}
