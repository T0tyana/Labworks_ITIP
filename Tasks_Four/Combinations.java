import java.util.Scanner;
import java.util.List;
import java.util.ArrayList; 

public class Combinations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nums = s.nextLine().split(",");
        int n = Integer.parseInt(nums[0]);
        int k = Integer.parseInt(nums[1]);
        s.close();

        System.out.println(format(bruteForce(n, k)));
    }

    public static List<String> bruteForce(int n, int k) {
        List<String> result = new ArrayList<>();

        if (n > k) {
            return result;
        }

        generate("", n, k, result);
        return result;
    }

    public static void generate(String current, int n, int k, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }

        for (int i = 0; i < k; i++) {
            char c = (char) ('0' + i);
            if (!current.contains(String.valueOf(c))) {
                generate(current + c, n, k, result);
            }
        }
    }

        public static String format(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < list.size(); i++) {
            sb.append("\"").append(list.get(i)).append("\"");
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
