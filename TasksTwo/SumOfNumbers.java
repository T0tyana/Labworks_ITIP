import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numbers = s.nextLine();
        s.close();
        int[] numms = parseInputData(numbers);
        System.out.println(sumRange(numms));
    }

    public static int[] parseInputData(String numbers) {
        int index = numbers.indexOf(',');
        int one = Integer.parseInt(numbers.substring(0, index));
        int two = Integer.parseInt(numbers.substring(index+2));
        int[] nums = {one, two};
        return nums; 
    }

    public static int sumRange(int[] numms) {
        int summ = 0;
        for (int i = numms[0]; i <= numms[1]; i++) {
            summ += i;
        }
        return summ;
    }
}
