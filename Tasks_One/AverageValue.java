import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numOne = s.nextDouble();
        double numTwo = s.nextDouble();
        double numThree = s.nextDouble();
        double answer = average(numOne, numTwo, numThree);
        if (answer == (int) answer) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
        s.close();
    }

    public static double average(double one, double two, double three) {
        return (one + two + three) / 3.0;
    }
}
