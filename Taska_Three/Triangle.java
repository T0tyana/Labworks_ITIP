import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nums = s.nextLine().split(", ");
        int one = Integer.parseInt(nums[0]);
        int two = Integer.parseInt(nums[1]);
        int three = Integer.parseInt(nums[2]);
        System.out.println(isTriangle(one, two, three));
        s.close();
    }

    public static boolean isTriangle(int one, int two, int three) {
        boolean result = false;
        if (one + two > three && two + three > one && one + three > two) {
            result = true;
        }
        return result;
    }
}
