import java.util.Random;

public class Exercies27 {
    public static void main(String[] args) {
        /**
         * 27. Напишите класс, который генерирует и выводит на экран
         * случайное целое чисел из диапазона положительных двузначных
         * чисел
         */
        Random random = new Random();
        int randomNumber=random.nextInt(10,100);
        System.out.println(randomNumber);



    }
}
