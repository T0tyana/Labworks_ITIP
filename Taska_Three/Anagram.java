import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] line = s.nextLine().split(", ");
        String wordOne = line[0];
        String wordTwo = line[1];
        System.out.println(isAnagram(wordOne, wordTwo));
        s.close();
    }

    public static boolean isAnagram(String first, String second) {
        String firstLower = first.toLowerCase();
        String secondLower = second.toLowerCase();
        
        if (firstLower.length() != secondLower.length()) return false;

        for (int i = 0; i < firstLower.length(); i++) {
            char a = firstLower.charAt(i);
            int index = secondLower.indexOf(a);

            if (index == -1) {
                return false;
            } else {
                secondLower = secondLower.substring(0, index) + secondLower.substring(index + 1);
            }
        }
        return true;
    }
}
