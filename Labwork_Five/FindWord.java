import java.util.regex.*;
import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        String letter = s.nextLine();
        s.close();

        try {

            if (text.isEmpty()) {
                System.out.println("Нет слов для проверки");
                return;
            }

            if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) { 
                throw new IllegalArgumentException("Введите ровно одну букву");
            }
            
            Pattern pattern = null;
            try {
                pattern = Pattern.compile("\\b" + letter + "\\w*\\b", Pattern.CASE_INSENSITIVE);
            } catch (PatternSyntaxException e) {
                System.out.println("Ошибка в регулярном выражении" + e.getDescription());
            }

            Matcher matcher = pattern.matcher(text);
            boolean flag = false;
            while (matcher.find()) {
                System.out.println(matcher.group());
                flag = true;
            }

            if (!flag) {
                System.out.println("Слов, начинающихся на эту букву, не найлено");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
