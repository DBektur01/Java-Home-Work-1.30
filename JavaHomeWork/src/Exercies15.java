import java.util.Scanner;

public class Exercies15 {
    public static void main(String[] args) {
        /**
         * Бир программа жазыныз, клавиатурадан уч сан ала турган, анан
         * аларды if, else if, else жардамдары менен ушул сандарды чоною
         * тартибинде чыгарасыздар консольго.
         * Мисалы:
         * Input: 2 243 1
         * Output: 1, 2, 243
         * Input: 1 -5 92
         * Output: -5, 1, 92
         * */
        Scanner scanner = new Scanner(System.in);
         int num1=scanner.nextInt();
         int num2=scanner.nextInt();
         int num3=scanner.nextInt();
         if(num1>=num2 && num1 >=num3){
             if(num2>=num3){
                 System.out.println(num3+" , "+num2+" , "+num1);
             }else{
                 System.out.println(num2+" , "+num3+" , "+num1);
             }
         } else if (num2>=num1 && num2>=num3) {
             if(num1>=num3){
                 System.out.println(num3+" , "+num1+" , "+num2);
             }else{
                 System.out.println(num1+" , "+num3+" , "+num2);
             }
         }else{
             if(num2>=num1){
                 System.out.println(num1+" , "+num2+" , "+num3);
             }else{
                 System.out.println(num2+" , "+num1+" , "+num3);
             }
         }

    }
}
