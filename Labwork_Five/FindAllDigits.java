import java.util.regex.*;

public class FindAllDigits {
    public static void main(String[] args) {
        String text = "The price is $19.99, discount 5%, amount: k120 and 0.75 liters. Spent: -40$, recieved: +20$";
        Pattern pattern = null;
        
        try {
            pattern = Pattern.compile("(?<=^|\\s)[-+]?\\d+(\\.\\d+)?");
        } catch (PatternSyntaxException e) {
            System.out.println("ошибка в регулярном выражении" + e.getDescription());
            return;
        }

        try {
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println(matcher.group());      
            }     
        } catch (Exception e) {
            System.out.println("Ошибка обработки текста" + e.getMessage());
        }
    }
}