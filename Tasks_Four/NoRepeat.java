import java.util.Scanner;

public class NoRepeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().toLowerCase();
        s.close();

        System.out.println(nonRepeat(input, input));
    }

    public static String nonRepeat(String original, String remaining) {
        if (remaining.isEmpty()) {
            return "";
        }

        char current = remaining.charAt(0);
        long count = original.chars().filter(c -> c == current).count();
        
        if (count > 3) {
            return nonRepeat(original, remaining.substring(1));
        } else {
            return current + nonRepeat(original, remaining.substring(1));
        }
    }
}