import java.util.Arrays;
import java.util.Random;

public class Exercies28 {
    public static void main(String[] args) {
        /**28. Напишите класс, который генерирует случайное положительное
         двузначное число, а затем генерирует три целых положительных
         числа, меньших первого.
         */

        Random random = new Random();
        int a=random.nextInt(10,100);
        System.out.println("Рандомдон келген эки орундуу сан: "+a);

        int[]numbers=new int[3];
        for (int i = 0; i <numbers.length; i++) {
            numbers[i]=random.nextInt(a);
        }System.out.println("Биринчи рандом сандан кичине үч рандом сан: "+Arrays.toString(numbers));
    }
}
