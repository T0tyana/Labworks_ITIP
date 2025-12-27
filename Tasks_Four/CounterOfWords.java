import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class CounterOfWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        System.out.println(wordHistogram(line));
    }

    public static String wordHistogram(String text) {
        Map<String, Integer> histogram = new LinkedHashMap<>();

        text = text.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                histogram.put(word, histogram.getOrDefault(word, 0) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        int i = 0;
        for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue());
            if (i < histogram.size() - 1) {
                sb.append(", ");
            }
            i++;
        }
        sb.append("}");

        return sb.toString();
    }
}
