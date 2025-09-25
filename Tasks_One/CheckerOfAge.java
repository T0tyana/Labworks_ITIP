import java.util.Scanner;

public class CheckerOfAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(checkAge(num));
        s.close();
    }

    public static String checkAge(int num) {
        if (num >= 18) {
            return "совершеннолетний";
        } else {
            return "несовершеннолетний";
        }
    }
}
