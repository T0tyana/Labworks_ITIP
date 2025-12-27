import java.util.*;

public class Meme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        String[] parts = input.split(",");

        int numOne = Integer.parseInt(parts[0].trim());
        int numTwo = Integer.parseInt(parts[1].trim());

        System.out.println(memeSum(numOne, numTwo));
    }

    public static int memeSum(int numOne, int numTwo) {
        String one = String.valueOf(numOne);
        String two = String.valueOf(numTwo);

        int maxLength = Math.max(one.length(), two.length());
        one = String.format("%" + maxLength + "s", one).replace(' ', '0');
        two = String.format("%" + maxLength + "s", two).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        for (int i = maxLength - 1; i >= 0; i--) {
            int digitOne = one.charAt(i) - '0';
            int digitTwo = two.charAt(i) - '0';

            int sum = digitOne + digitTwo;

            result.insert(0, sum);
        }

        return Integer.parseInt(result.toString());
    }
}
