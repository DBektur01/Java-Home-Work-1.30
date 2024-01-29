import java.util.Scanner;

public class Exercies6 {
    public static void main(String[] args) {
        /**
         *  Напишите программу, который принимает с клавиатуры целое
         * положительное трехзначное число. Затем следует построить новое
         * значение, составленное
         * из цифр числа, введенного с клавиатуры, но в обратном
         * порядке. После этого новое значение следует уменьшить на 20, и
         * окончательныйрезультат вывести на экран.
         * Мисалы:
         * Input: 327
         * Output: 703*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("3 орунду сан жазыныз: ");
        int num=scanner.nextInt();
        int result=num-20;
        int a=result%10;
        int b=result/10%10;
        int c=result/100;


        System.out.printf("Output: %d%d%d ",a,b,c);

    }
}
