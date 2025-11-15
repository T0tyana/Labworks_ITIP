import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        System.out.println(reverseWords(in));
        s.close();
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[words.length - 1 - i];
        }
        return String.join(" ", result);
    }       
}
