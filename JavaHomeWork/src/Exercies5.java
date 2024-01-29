import java.util.Scanner;

public class Exercies5 {
    public static void main(String[] args) {
        /**
         * Напишите программу, который принимает с клавиатуры целое
         * положительное двузначное число. Затем следует построить новое
         * значение, составленное из цифр числа, введенного с клавиатуры,
         * но в обратном порядке. После этого новое значение следует
         * увеличить на 8, и окончательный результат вывести на экран.
         * Мисалы:
         * Input: 37
         * Output: 81
         * */
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();

        int a=number/10;
        int b=number%10;

        int count=b*10+a;
        count+=8;
        System.out.println(count);





    }
}
