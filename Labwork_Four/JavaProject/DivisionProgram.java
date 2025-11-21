package JavaProject;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Введите первое число: ");
            double a = s.nextDouble();
            
            System.out.print("Введите второе число: ");
            double b = s.nextDouble();

            double result = divide(a, b);
            System.out.println("Результат деления: " + result);
        
        } catch (CustomDivisionException e) {
            System.out.println("Ошибка: " + e.getMessage());
            ExceptionLogger.log(e);
        }
        
        s.close();
    }
        

    public static double divide(double a, double b) throws CustomDivisionException {
        if (b == 0) {
            throw new CustomDivisionException("Попытка деления на ноль");
        }
        return a/ b;
    }
}
