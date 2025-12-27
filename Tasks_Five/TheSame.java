import java.util.*;

public class TheSame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        String[] parts = input.split(",");

        String one = parts[0].trim();
        String two = parts[1].trim();

        System.out.println(sameLetterPat(one, two));
    }

    public static boolean sameLetterPat(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }

        Map<Character, Character> mapping = new HashMap<>();
        Map<Character, Character> reverseMapping = new HashMap<>();

        for (int i = 0; i < one.length(); i++) {
            char c1 = one.charAt(i);
            char c2 = two.charAt(i);

             if (mapping.containsKey(c1)) {
                if (mapping.get(c1) != c2) {
                    return false;
                }
            } else {
                mapping.put(c1, c2);
            }
            
            if (reverseMapping.containsKey(c2)) {
                if (reverseMapping.get(c2) != c1) {
                    return false; 
                }
            } else {
                reverseMapping.put(c2, c1);
            }
        }
        
        return true;
    }
}

