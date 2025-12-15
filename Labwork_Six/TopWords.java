import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String filepath = "text.txt";
        File file = new File(filepath);

        Scanner s = null;
        try {
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        }

        Map<String, Integer> wordCounter = new HashMap<>();

        while (s.hasNext()) {
            String word = s.next().toLowerCase();

            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");

            if (word.isEmpty()) {
                continue;
            }

            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        }

        s.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCounter.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                                Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());                    
            }
        });

        System.out.println("Топ 10 самых частых слов");
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            count++;
            if (count == 10) {
                break;
            }
        }
    }
    
}