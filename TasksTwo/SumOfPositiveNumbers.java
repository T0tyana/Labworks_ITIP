import java.util.ArrayList;
import java.util.Scanner;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        s.close();
        ArrayList<Integer> numms = parseNum(n);
        System.out.println(sumOfPositives(numms));
    }

    public static ArrayList<Integer> parseNum(String n) {
        String[] nums = n.split(",");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String m : nums) {
            numbers.add(Integer.parseInt(m.trim()));        
        }
        return numbers;
    }   

    public static int sumOfPositives(ArrayList<Integer> numbers) {
            int ans = 0;
            for (int b : numbers) {
                if (b > 0) {
                    ans += b;
                }
            }
            return ans;
    }
}
