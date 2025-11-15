import java.util.Arrays;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] nums = input.substring(1, input.length() - 1).split(", ");
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i].trim());
        }
        System.out.println(Arrays.toString(filterEven(numbers)));
        s.close();
    }

    public static int[] filterEven(int[] numsIn) {
        int count = 0;
        for (int num : numsIn) {
            if (num % 2 == 0){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : numsIn) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        return result;
    } 
}
