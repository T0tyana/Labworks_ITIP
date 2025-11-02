import java.util.*;

public class ShiftToTheRight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine().trim();
        s.close();
        String[] parts = n.replace("[", "").split("\\],\\s*");
        String arrayPart = parts[0];
        int k = Integer.parseInt(parts[1]);
    
        if (arrayPart.isEmpty()) {
            System.out.println("[]");
            return;
        }

        String[] nums = arrayPart.split(",\\s*");
        int[] arrNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrNums[i] = Integer.parseInt(nums[i]);
        }
        
        int[] rotated = rotateRight(arrNums, k);
        System.out.println(Arrays.toString(rotated));
    }

    public static int[] rotateRight(int[] arrNums, int k) {
        int o = arrNums.length;
        if (o == 0) return arrNums;
        k = k % o;
        int[] res = new int[o];
        for (int i = 0; i < o; i++) {
            res[(i + k) % o] = arrNums[i];
        }
        return res;
    }
}
