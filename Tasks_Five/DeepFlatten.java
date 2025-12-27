import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeepFlatten {
    public static void main(String[] args) {
            
        
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        s.close();

        List<Integer> result = flattenWithStack(input);
        System.out.println(result);
    }

    public static List<Integer> flattenWithStack(String input) {
        List<Integer> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                current.append(c);
            } else {
                if (current.length() > 0) {
                    result.add(Integer.parseInt(current.toString()));
                    current.setLength(0);
                }

                if (c == '[' || c == ',' || c == ' ' || c == ']') {
                    continue;
                }
            }
        }

        if (current.length() > 0) {
            result.add(Integer.parseInt(current.toString()));
        }

        return result;
    }
}
