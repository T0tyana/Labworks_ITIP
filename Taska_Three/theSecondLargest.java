import java.util.Scanner;

public class theSecondLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }
        System.out.println(secondLargest(nums));
        s.close();
    }

    public static int secondLargest (int[] numbers) {
        int maxOne = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > maxOne) {
                secondMax = maxOne;
                maxOne = num;
            } else if (num > secondMax && num < maxOne) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}