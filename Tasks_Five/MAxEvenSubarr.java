import java.util.*;

public class MAxEvenSubarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().replace("]", "").replace("[", "").trim();
        s.close();

        List<Integer> array = parseArray(input);
        System.out.println(maxEvenSub(array));
    }

    private static List<Integer> parseArray(String input) {
        List<Integer> result = new ArrayList<>();
        if (input.isEmpty()) {
            return result;
        }

        String[] parts = input.split(",");
        for (String part : parts) {
            result.add(Integer.parseInt(part.trim()));
        }

        return result;
    }

    public static int maxEvenSub(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }

        int n = arr.size();
        int maxEvenSum = 0;

        for (int i = 0; i < n; i++) {
            int curSum = 0;

            for (int j = i; j < n; j++) {
                curSum += arr.get(j);

                if (!(i == 0 && j == n - 1)) {
                    if (curSum % 2 == 0 && curSum > maxEvenSum) {
                        maxEvenSum = curSum;
                    }
                }
            }
        }

        return maxEvenSum;
    }
}
