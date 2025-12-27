import java.util.*;

public class FindShifr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();

        String[] parts = input.split(",");
        if (parts.length != 2) {
            System.out.println(-1);
            return;
        }
        String one = parts[0].trim();
        String two = parts[1].trim();

        System.out.println(findShift(one, two));
    }

    public static int findShift(String one, String two) {
        if (one.length() != two.length()) {
            return - 1;
        }

        if (one.isEmpty()) {
            return 0;
        }

        char c1 = one.charAt(0);
        char c2 = two.charAt(0);
        
        int shift = calculateShift(c1, c2);
        if (shift == -1) {
            return -1;
        }
        
        for (int i = 1; i < one.length(); i++) {
            int currentShift = calculateShift(one.charAt(i), two.charAt(i));
            if (currentShift != shift) {
                return -1;
            }
        }
        
        return shift;
    }
    
    private static int calculateShift(char c1, char c2) {
        if (c1 < 'a' || c1 > 'z' || c2 < 'a' || c2 > 'z') {
            return -1;
        }
        
        int shift = (c2 - c1 + 26) % 26;
        
        return shift;
    }
}
