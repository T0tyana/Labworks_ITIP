import java.util.Scanner;

public class DiadonalSumma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.close();
        String[] n = s.nextLine().split("\\],\\s*");
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i].replace("[", "").replace("]", "");
        }
        int ans = diagonalSum(n);
        System.out.println(ans);
    }   

    public static int diagonalSum(String[] n) {
        int summa = 0;
        for (int i = 0; i < n.length; i++) {
            String num = n[i].replace(",", "");
            summa += Character.getNumericValue(num.charAt(i));
        }
        return summa;
    }
}
