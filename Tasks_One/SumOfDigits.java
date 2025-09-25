import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(digitSum(num));
        s.close();
    }

    public static int digitSum(int num) {
        int summ = 0;
        num = Math.abs(num);
        while (num > 0) {
            summ += num % 10;
            num /= 10;
        }
        return summ;
    }
}
