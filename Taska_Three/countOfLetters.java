import java.util.Scanner;

public class countOfLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(countVowels(input));
        s.close();
    }

    public static int countVowels(String in) {
        int counter = 0;
        String lower = in.toLowerCase();
        for (int i = 0; i < in.length(); i++) {
            if (lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' || lower.charAt(i) == 'o' || lower.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }
}
