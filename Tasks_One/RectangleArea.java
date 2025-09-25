import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println(rectangleArea(a, b));
        s.close();
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }
}
