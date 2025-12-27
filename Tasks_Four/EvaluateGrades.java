import java.util.Scanner;

public class EvaluateGrades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        s.close();

        line = line.replace("[", "").replace("]", "").trim();
        String[] numbers = line.split(",");
        int[] grades = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            grades[i] = Integer.parseInt(numbers[i].trim());
        }

        System.out.println(evaluateGrades(grades));
    }

    public static String evaluateGrades(int[] grades) {
        int A = 0, B = 0, C = 0, D = 0, F = 0;

        for (int g : grades) {
            if (g >= 90) A++;
            else if (g >= 80) B++;
            else if (g >= 70) C++;
            else if (g >= 60) D++;
            else F++;
        }

        StringBuilder result = new StringBuilder();
        result.append("{");
        boolean first = true;

                if (A > 0) { result.append("A: ").append(A); first = false; }
        if (B > 0) { if (!first) result.append(", "); result.append("B: ").append(B); first = false; }
        if (C > 0) { if (!first) result.append(", "); result.append("C: ").append(C); first = false; }
        if (D > 0) { if (!first) result.append(", "); result.append("D: ").append(D); first = false; }
        if (F > 0) { if (!first) result.append(", "); result.append("F: ").append(F); }
        
        result.append("}");
        return result.toString();
    }
}
