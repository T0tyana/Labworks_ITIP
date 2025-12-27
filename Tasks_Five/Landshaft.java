import java.util.*;

public class Landshaft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        System.out.println(isLandshaft(input));
    }

    public static boolean isLandshaft(String in) {
        String cleanInput = in.replace("[", "").replace("]", "").trim();
        if (cleanInput.isEmpty()) {
            return false;
        }

        String[] parts = cleanInput.split(",");
        List<Integer> arr = new ArrayList<>();

        for (String part : parts) {
            part = part.trim();
            if (!part.isEmpty()) {
                arr.add(Integer.parseInt(part));
            }
        }

        if (arr.size() < 3) {
            return false;
        }

        int peak = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                peak = i;
            }
        }

        if (peak == 0 || peak == arr.size() - 1) {
            return false;
        }

        for (int i = 0; i < peak; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                return false;
            }
        }

        for (int i = peak; i < arr.size() - 1; i++) {
            if (arr.get(i) <= arr.get(i + 1)) {
                return false;
            }
        }

        int peakCount = 0;
        for (int num : arr) {
            if (num == max) {
                peakCount++;
            }
        }

        return peakCount == 1;
    }
    
}