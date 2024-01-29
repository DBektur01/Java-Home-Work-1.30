import java.util.Scanner;

public class Exercies25 {
    public static void main(String[] args) {
        /**
         * 25. Напишите класс, который читает с клавиатуры символ и
         * проверяет, является ли введенный символ буквой латинского
         * алфавита. По результатам проверки следует вывести на экран
         * соответствующее сообщение.
         * */
        Scanner scanner = new Scanner(System.in);
        char symbol=scanner.next().charAt(0);
        if(symbol>='A' && symbol <='Z' || symbol>='a' && symbol<='z'){
            System.out.println("Киргизилген белги латын алфавитинин тамгасы.");
        } else {
            System.out.println("Киргизилген символ латын алфавитинин тамгасы эмес.");
        }
    }
}
