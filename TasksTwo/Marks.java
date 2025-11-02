import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        System.out.println(grade(num));
    }

    public static String grade(int num) {
        if (90 <= num && num <= 100) {
            return "A";
        } else if (80 <= num && num <= 89) {
            return "B";
        } else if (70 <= num && num <= 79) {
            return "C";
        } else if (60 <= num && num <= 69) {
            return "D";
        } else if (0 <= num && num <= 69) {
            return "F";
        } else {
            return "Invalid";
        }
    }
}
