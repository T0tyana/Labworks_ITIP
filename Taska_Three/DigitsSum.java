import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        System.out.println(sumOfDigits(num));
        s.close();
    }

    public static int sumOfDigits (String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return result;
    }
}
