import java.util.regex.*;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        s.close();

        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("!$0!");
        System.out.println(result);
    }
}
