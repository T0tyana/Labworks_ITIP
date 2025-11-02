import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        s.close();
        ArrayList<Integer> numms = parseNum(n);
        System.out.println(hasDuplicates(numms));
    }

        public static ArrayList<Integer> parseNum(String n) {
        String[] nums = n.split(",");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String m : nums) {
            numbers.add(Integer.parseInt(m.trim()));        
        }
        return numbers;
    }

    public static boolean hasDuplicates(ArrayList<Integer> nums) {
        for (int m : nums) {
            if (Collections.frequency(nums, m) > 1) {
                return true;
            }
        } return false;
    }
}
