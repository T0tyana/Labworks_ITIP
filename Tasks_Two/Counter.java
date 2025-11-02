import java.util.Arrays;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nums = Integer.toString(s.nextInt()).replace("-", "");
        s.close();
        int[] result = countEvenOddDigits(nums);
        System.out.println(Arrays.toString(result).replace("[", "").replace("]", ""));
    }

    public static int[] countEvenOddDigits(String nums) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) % 2 == 0 && nums.charAt(i) != 0) {
                res[0]++;
            } else if (nums.charAt(i) % 2 != 0 && nums.charAt(i) != 0) {
                res[1]++;
            } else {
                res[0]++;
            }
        }
        return res;
    } 
}
