public class ArrayAverage {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5"};
        //String[] arr = {"1", "2", "gg", "4"};
        //String[] arr = {};

        int sum = 0;
        int counter = 0;

        try {
            for (int i = 0; i < arr.length; i++) { 
                int summa = Integer.parseInt(arr[i]);
                sum += summa;
                counter++;
            }

            if (counter == 0) {
                throw new ArithmeticException("Массив пуст");
            }

            double average = (double) sum / counter;
            System.out.println("Среднее арифметическое: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: элемент массива не является числом");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}