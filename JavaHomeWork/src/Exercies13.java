import java.util.Scanner;

public class Exercies13 {
    public static void main(String[] args) {
        /**
         * 3. Бир программа жазыныздар, ал программа консольдон 2
         * орундуу сан алыш керек, бир гана if менен текшериш керек сандын
         * 1 оруну жана 2 орунунун кобойтуусу чонбу же сан озубу
         * Мисалы:
         * Input: 25
         * Output: 25>10
         * */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int a = number / 10;
        int b = number % 10;

        int res=a*b;

        if(number>res){
            System.out.println(number+" > "+res);
        } else if (number<res) {
            System.out.println(number+" < "+res);
        }else{
            System.out.println(number+" == "+res);
        }
    }
}
