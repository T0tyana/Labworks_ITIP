import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(season(num));
        s.close();
    }

    public static String season(int number) {
        if (number == 12 || number == 1 || number == 2) {
            return "Зима";
        } else if (number >= 3 && number <= 5) {
            return "Весна";
        } else if (number >= 6 && number <= 8) {
            return "Лето";
        } else if (number >= 9 && number <= 11) {
            return "Осень";
        } else {
            return "Нет такого месяца";
        }        
    }
}
