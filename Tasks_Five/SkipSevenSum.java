import java.util.Scanner;

public class SkipSevenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        System.out.println(skipSevenSum(num));
    }

    public static long skipSevenSum(int num) {
        long sum = 0;

        for (int i = 0; i <= num; i++) {
            if (!containsSeven(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean containsSeven(int number) {
        int n = Math.abs(number);

        while (n > 0) {
            int digit = n % 10;
            if (digit == 7) {
                return true;
            }
            n /= 10;
        }

        return false;
    }
}
