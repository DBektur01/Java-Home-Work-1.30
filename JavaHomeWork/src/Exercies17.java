import java.util.Scanner;

public class Exercies17 {
    public static void main(String[] args) {
        /**
         * 17. Напишите программу, который принимает с клавиатуры два
         * числа: первое - количество учеников в классе, второе - количество
         * стульев в классной комнате. Программа проверит соответствие
         * между этими двумя значениями и выведет на экран
         * соответствующую информацию (например, для значений
         * 35 и 39 на экран выводится 4 стула лишних).
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество учеников: ");
        int student=scanner.nextInt();
        System.out.print("количество  стульев: ");
        int chair=scanner.nextInt();
        if(student>chair){
            System.out.println(student-chair+" Ученику не хватает места ");
        } else if (chair>student) {
            System.out.println(chair-student+" стула лишних");
        }else {
            System.out.println("Стульев достаточно");
        }



    }
}
