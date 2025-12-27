import java.util.Arrays;

public class ArraySummator extends Thread {
    private double[] part;
    private double result;

    public ArraySummator(double[] arr) {
        part = arr;
    }

    @Override
    public void run() {
        result = 0;
        for (double elem : part) {
            result += elem;
        }
        System.out.println("Поток " + getName() + " посчитал сумму. Она равна: " + result);
    }

    public double getSum() {
        return result;
    }

    public static void main(String[] args) {
    double[] array = {12.0, 11.0, 15.9, 20.0, 22.22, 67.7};

    try {
        int middle = array.length / 2;
        double[] firstPart = Arrays.copyOfRange(array, 0, middle);
        double[] secondPart = Arrays.copyOfRange(array, middle, array.length);

        ArraySummator threadOne = new ArraySummator(firstPart);
        ArraySummator threadTwo = new ArraySummator(secondPart);

        threadOne.setName("Thread_1");
        threadTwo.setName("Thread_2");

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        double resultOne = threadOne.getSum();
        double resultTwo = threadTwo.getSum();

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println((resultOne + resultTwo));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Поток был прерван: " + e.getMessage());
        }
    }
}