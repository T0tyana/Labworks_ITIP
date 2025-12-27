import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(uniqueOrder(input));
    }

    public static String uniqueOrder(String str) {
        LinkedHashSet<Character> uniqueChar = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            uniqueChar.add(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : uniqueChar) {
            result.append(ch);
        }

        return result.toString();
    }
}    