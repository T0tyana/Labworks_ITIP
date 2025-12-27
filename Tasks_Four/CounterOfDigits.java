import java.util.*;

public class CounterOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        s.close();

        System.out.println(digitHistogram(num));
    }

    public static String digitHistogram(String num) {
        int[] counter = new int[10];

        for (char c : num.toCharArray()) {
            if (Character.isDigit(c)) {
                counter[c - '0']++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < counter.length; i++) {
            sb.append(counter[i]);
            if (i < counter.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
