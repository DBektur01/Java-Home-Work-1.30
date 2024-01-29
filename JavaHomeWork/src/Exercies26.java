import java.util.Scanner;

public class Exercies26 {
    public static void main(String[] args) {
        /**
         * 26. Напишите класс, который принимает с клавиатуры два
         строковых значения, каждое из которых содержит имя человека, и
         проверяет, являются ли эти люди тезками. По результатам
         проверки следует вывести на экран соответствующее сообщение
         */

        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        String sureName=scanner.nextLine();
        if(name.equals(sureName)){
            System.out.println("Эти люди являются тезками.");
        } else {
            System.out.println("Эти люди не являются тезками.");
        }
    }
}
