import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(countDivisors(n));
    }

    public static int countDivisors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        } 
        return c;
    }
}