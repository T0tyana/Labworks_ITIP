import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(fibonacci(num));
        s.close();
    }

    public static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
