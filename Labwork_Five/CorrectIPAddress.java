import java.util.regex.*;
import java.util.Scanner;

public class CorrectIPAddress {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ip_address = s.nextLine().trim();
        
        try {
            if (isRightIPAddress(ip_address)) {
                System.out.println("Корректный IP-адрес");
            } else {
                System.out.println("Некорректный IP-адрес");    
            }
        } catch (Exception e) {
            System.out.println("Ошибка при проверки IP-адреса" + e.getMessage());
        }

        s.close();
    }

    public static boolean isRightIPAddress(String ip) {
        Pattern pattern = null;

        try {
            pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$");
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка в регулярном выражении" + e.getDescription());
            return false;
        }
        
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
