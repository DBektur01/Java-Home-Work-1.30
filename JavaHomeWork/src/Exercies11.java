import java.util.Scanner;

public class Exercies11 {
    public static void main(String[] args) {
        /**
         * Напишите программу, который принимает с клавиатуры два
         * целых числа и, если первое больше второго, выводит на экран их
         * сумму, если же наоборот - выводит на экран их произведение. В
         * случае же, если числа одинаковы, программа выводит на экран
         * сообщение Числа равны
         * */
        Scanner scanner = new Scanner(System.in);
        int number1=scanner.nextInt(),
                number2=scanner.nextInt();

        if(number1>number2){
            int sum=number1+number2;
            System.out.println("Сумма чисел: "+number1+" + "+number2+" = "+sum);
        } else if (number2>number1) {
            int result=number1*number2;
            System.out.println("Произведение чисел: "+number1+" * "+number2+" = "+result);
        }else {
            System.out.printf("Числа равны: %d == %d",number1,number2);
        }

    }
}
