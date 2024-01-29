import java.util.Random;
import java.util.Scanner;

public class Exercies29 {
    public static void main(String[] args) {
        /**
         * 29. Напишите программу, сиз консольдон эки маани алышыныз
         керек рандом учун, биринчи сан нижний диапазон, экинчи сан
         верхний диапазон, рандом сан бир санды генерация кылат.
         Сиз консольдон бир сан киргизишиниз керек, эгерде сиз жазган сан
         менен рандом сан барабар болсо, окуучу тапты деген нерсени
         чыгарышыныз керек, болбосо окуучу таппады деген жазуу.
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Oт: ");
        int a=scanner.nextInt();
        System.out.print("До: ");
        int b=scanner.nextInt();

        boolean isTrue=true;

        while (isTrue) {
            int randomNumber = random.nextInt(a, b);
            System.out.print("Сан бериниз : ");
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("окуучу тапты --> randomNumber: " + randomNumber);
            } else {
                System.out.println("окуучу таппады -->  randomNumber: " + randomNumber);
                isTrue=false;
            }
        }

    }
}
