import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unification {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nums = s.nextLine();
        s.close();
        String[] parts = nums.split("\\]");
        String first = parts[0].replace("[", "").trim();
        String second = parts[1].replace("[", "").replaceFirst(",", "").trim();
        ArrayList<Integer> one = parseNum(first);
        ArrayList<Integer> two = parseNum(second);
        ArrayList<Integer> answer = mergeUniqueSorted(one, two);
        System.out.println(answer.toString().replace(" ", ""));
        } 

        public static ArrayList<Integer> parseNum(String n) {
        String[] nums = n.split(",");
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean empty= true;
        for (String s : nums) {
            if (s != null && !s.trim().isEmpty()) {
                empty = false;
                break;
            }
        }
        if (!empty) {
            for (String m : nums) {
            numbers.add(Integer.parseInt(m.trim()));        
            }
        }    
        return numbers;
    }

    public static ArrayList<Integer> mergeUniqueSorted(ArrayList<Integer> one, ArrayList<Integer> two) {
        ArrayList<Integer> three = new ArrayList<>();
        for (int num : one) three.add(num);
        for (int num : two) three.add(num);

        Set<Integer> unique = new HashSet<>(three);
        ArrayList<Integer> result = new ArrayList<>(unique);
        Collections.sort(result);
        return result;
    }

}