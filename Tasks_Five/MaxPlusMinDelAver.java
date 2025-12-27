import java.util.*;

public class MaxPlusMinDelAver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().replace("[", "").replace("]", "").trim();
        s.close();
        List<Double> arr = parseArray(input);
        System.out.println(maMiAver(arr));
    }

    private static List<Double> parseArray(String input) {
        List<Double> result = new ArrayList<>();
        if (input.isEmpty()) {
            return result;
        }
        
        String[] parts = input.split(",");
        for (String part : parts) {
            result.add(Double.parseDouble(part.trim()));
        }

        return result;
    }

    public static double maMiAver(List<Double> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0.0;
        }

        double min = arr.get(0);
        double max = arr.get(0);
        double sum = 0.0;

        for (double num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            sum += num;
        }

        double average = sum / arr.size();
        if (Math.abs(average) < 1e-10) {
            return 0.0;
        }

        return (max - min) / average;
    }
}
