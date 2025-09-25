import java.util.Scanner;

public class WeeksAndDays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(daysToWeeks(num));
        s.close();             
    }

    public static String daysToWeeks(int num) {
        int weeks = num / 7;
        int days = num % 7;
        String weekAns = weeks + " ";
        if (weeks % 10 == 1 && weeks % 100 != 11) {
            weekAns += "неделя";
        } else if (weeks % 10 >= 2 && weeks % 10 <= 4 && (weeks % 100 < 10 || weeks % 100 >= 2)) {
            weekAns += "недели";
        } else {
            weekAns += "недель";
        }

        String dayAns = days + " ";
        if (days % 10 == 1 && days % 100 != 11) {
            dayAns += "день";
        } else if (days % 10 >= 2 && days % 10 <= 4 && (days % 100 < 10 || days % 100 >= 2)) {
            dayAns += "дня";
        } else {
            dayAns += "дней";
        }

        return weekAns + " и " + dayAns;
    }
}
