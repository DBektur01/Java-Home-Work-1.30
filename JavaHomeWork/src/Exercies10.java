import java.util.Scanner;

public class Exercies10 {
    public static void main(String[] args) {
        /**
         * Напишите программу, который принимает с клавиатуры целое
         * положительное число и, если оно как минимум трехзначное и
         * положительное, уменьшает его на 1.
         * Мисалы:
         * Input: 332
         * Output: 331
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("3 орунду сан жазыныз: ");
        int number=scanner.nextInt();
        String numberAsString=Integer.toString(number);
        if (numberAsString.length()==3){
            number-=1;
            System.out.println(number);
        }else if(number<0){
            System.out.println("Напишите положительное число: ");
        }else {
            System.out.println(number);
        }
    }
}
