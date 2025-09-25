import java.util.Scanner;

public class TemperatureTransfer {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double c = a.nextDouble();
        double f = toFahrenheit(c);
        System.out.println((int) Math.round(f));
        a.close();
    }

    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }

}