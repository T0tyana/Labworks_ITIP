import java.util.Scanner;

public class VernamCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine().trim();
        s.close();

        int commaIndex = -1;
        boolean inQuotes = false;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '"') inQuotes = !inQuotes;
            else if (c == ',' && !inQuotes) {
                commaIndex = i;
                break;
            }
        }

        if (commaIndex == -1) {
            System.out.println("[]");
            return;
        }

        String text = line.substring(0, commaIndex).trim();
        String key  = line.substring(commaIndex + 1).trim();

        if (text.startsWith("\"") && text.endsWith("\"")) text = text.substring(1, text.length() - 1);
        if (key.startsWith("\"") && key.endsWith("\"")) key = key.substring(1, key.length() - 1);

        int[] decoded = decode(text, key);
        System.out.print("[");
        for (int i = 0; i < decoded.length; i++) {
            System.out.print(decoded[i]);
            if (i < decoded.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] decode(String text, String key) {

        int[] result = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i) ^ key.charAt(i % key.length());
        }

        return result;
    }
}
