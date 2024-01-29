import java.util.Scanner;

public class Exercies20 {
    public static void main(String[] args) {
/** Напишите программу , которая принимает с клавиатуры
 трехзначное положительное число и проверяет, содержится ли в
 нем хотя бы один ноль. По результатам проверки надо вывести
 количество нулей в числе
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 орунду сан жазыныз: ");
        int number=scanner.nextInt();
        int count=0;
        if(number%10==0){
            count++;
        } else if ((number/10)%10==0) {
            count++;
            
        } else if ((number/100)%10==0) {
            count++;
            
        }
        if(count>0){
            System.out.println("чило содержит "+count+" нолей");
        }else {
            System.out.println("число не содержит нолей");
        }


    }
}
