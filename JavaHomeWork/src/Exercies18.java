import java.util.Scanner;

public class Exercies18 {
    public static void main(String[] args) {

        /**
         * 18. Бир программа жазыныз, сиз торт орундуу оң сан бериниз, сиз
         * текшеришиниз керек кайсыл орундагы саны чон экен, консольго
         * чыгарышынз мисалы: биринчи сан 25 экинчи сан 35 тен чон, же экоо
         * барабар болсо 25 жана 25 бири бирине барабар деп чыгарасыз.
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 4 орунду сан жазыныз: ");
        int number=scanner.nextInt();

        int a=number/100;
        int b=number%100;

        if(a>b){
            System.out.printf("%d > %d",a,b);
        } else if (b>a) {
            System.out.printf("%d > %d",b,a);
        }else{
            System.out.printf("%d == %d",a,b);

        }

    }
}
