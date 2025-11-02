import java.util.ArrayList;
import java.util.Scanner;

public class ClampNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        s.close();
        ArrayList<Integer> numms = parseNum(num);
        System.out.println(clamp(numms));

    }

    public static ArrayList<Integer> parseNum(String n) {
    String[] nums = n.split(",");
    ArrayList<Integer> numbers = new ArrayList<>();
    for (String m : nums) {
        numbers.add(Integer.parseInt(m.trim()));        
        }
        return numbers;
    } 

    public static int clamp(ArrayList<Integer> numbers) {
        if (numbers.get(0) < numbers.get(1)) {
            return numbers.get(1);
        } else if (numbers.get(0) > numbers.get(2)) {
            return numbers.get(2);
        } else {
            return numbers.get(0);
        }
    }
}
