import java.util.Random;
import java.util.Scanner;

public class Exercies30 {
    public static void main(String[] args) {
        /**30. Напишите программу, которая генерирует числа от 1 до 3, 1 -
         камень, 2 - ножницы, 3 бумага. Сиз озунуз бир сан бересиз
         консольдон анан текшересиз if, else if, else шарттык операторлор
         менен, ким утту же тең чыгуу болду деп.
         Компьютер утса, консольго толук малымат чыгыш керек кимде
         кайсыл вариант чыкты жана ким утту
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - камень\n2 - ножницы\n3 - бумага.");
        boolean isTrue=true;
        while (isTrue){
            int computer=random.nextInt(1,4);
            int user = scanner.nextInt();
            if (user <=3 && user >=1) {
                if (user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1) {
                    System.out.println("User Win  --> computer : " + computer);
                } else if (computer==1 && user==2 || computer==2 && user == 3 || computer==3 && user==1) {
                    System.out.println("Computer Win --> computer : " + computer);
                }else {
                    System.out.println(" user == computer " + computer);
                }
            } else {
                System.out.println(" 1 - 3 ");
                isTrue=false;
            }

        }
    }
}
