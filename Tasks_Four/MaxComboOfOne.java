import java.util.Scanner;

public class MaxComboOfOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        s.close();

        line = line.replace("[", "").replace("]", "").trim();

        int[] numbers;
        if (line.isEmpty()) {
            numbers = new int[0];
        } else {
            String[] nums = line.split(",");
            numbers = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numbers[i] = Integer.parseInt(nums[i].trim()); // убираем пробелы
            }
        }

        System.out.println(maxConsecutiveOnes(numbers));
    }

    public static int maxConsecutiveOnes(int[] numbers) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : numbers) {
            if (num == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
