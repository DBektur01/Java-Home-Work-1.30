import java.util.Scanner;

public class Exercies14 {
    public static void main(String[] args) {
        /**
         * Бир программа жазыныз, сиз клавиатурадан эки сан беришиниз
         * керек, биринчи сан окуучулардын саны, экинчи отургучтардын саны.
         * Сиздер текшеришиниздер керек окуучуларга орун жетеби же
         * жетпейби.
         * Мисалы
         * Input: 25 30
         * Output: “Отургучтардын саны окуучулардан коп экен”
         * жана “Отургучтар жетет экен” , “Отургучтар жетпей калат деген”
         * варианттар болот.
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Окуучулардын  саны: ");
        int student=scanner.nextInt();
        System.out.print("Отургучтардын саны: ");
        int chair=scanner.nextInt();
        if(student>chair){
            System.out.println(student-chair+" Окуучуга отургуч жетпей калды ");
        } else if (chair>student) {
            System.out.println(chair-student+" Отургуч ашыкча");
        }else {
            System.out.println("Отургучтар жетет экен");
        }
    }
}
