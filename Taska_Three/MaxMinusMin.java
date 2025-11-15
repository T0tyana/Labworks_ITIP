import java.util.Scanner;

public class MaxMinusMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nums = s.nextLine();
        String[] numbers = nums.substring(1, nums.length() - 1).split(", ");
        int[] numms = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numms[i] = Integer.parseInt(numbers[i].trim());
        }
        System.out.println(differenceMaxMin(numms));
        s.close();
    }

    public static int differenceMaxMin(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {max = num;}
            if (num < min) {min = num;}
        }
        return max - min;
    }
}
