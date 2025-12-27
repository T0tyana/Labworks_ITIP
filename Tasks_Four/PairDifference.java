import java.util.*;

public class PairDifference {

    public static String pairDifference(int[] arr, int k) {

        if (k == 0) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            int count = 0;
            for (int f : freq.values()) {
                if (f > 1) {
                    count += f * (f - 1) / 2;
                }
            }
            return String.valueOf(count);
        }

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int count = 0;
        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return String.valueOf(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        String[] parts = line.split("],");
        String arrayPart = parts[0].replace("[", "");
        String numberPart = parts[1].trim();

        String[] nums = arrayPart.split(",");
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i].trim());
        }

        int k = Integer.parseInt(numberPart);
        System.out.println(pairDifference(arr, k));
    }
}