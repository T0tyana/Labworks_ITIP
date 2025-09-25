import java.util.Scanner;

public class EvenChecker {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(isEven(num));
        s.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
