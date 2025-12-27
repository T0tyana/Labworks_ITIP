import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurnsAlter {
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        System.out.println(turns(num));
    }

    public static int turns(int num) {
        List<Integer> digits = getUniqueDigits(num);
        
        if (digits.size() < 3) {
            return 0;
        }

        int turnsCount = 0;

        for (int i = 1; i < digits.size() - 1; i++) {
            int prev = digits.get(i - 1);
            int curr = digits.get(i);
            int next = digits.get(i + 1);

            if ((prev < curr && curr > next) || (prev > curr && curr < next)) {
                turnsCount++;
            }
        }
        return turnsCount;
    }

    private static List<Integer> getUniqueDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        String numStr = Integer.toString(Math.abs(number));

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            if (digits.isEmpty() || digit != digits.get(digits.size() - 1)) {
                digits.add(digit);
            }
        }
        return digits;
    }
}
