import java.util.Scanner;

public class CountOfWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        System.out.println(countWords(line));
        s.close();
    }

    public static int countWords(String words) {
        int result = 0;
        String[] newLine = words.trim().split("\\s+");
        result = newLine.length;
        return result;
    }
}
