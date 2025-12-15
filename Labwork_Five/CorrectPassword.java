import java.util.regex.*;
import java.util.Scanner;

public class CorrectPassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        s.close();

        try {
            if (checkPassword(password)) {
                System.out.println("Корректный пароль");
            } else {
                System.out.println("Пароль некорректный");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка при проверке пароля" + e.getMessage());
        }
    }

    public static boolean checkPassword(String pass) {
        Pattern pattern = null;
        try {
            pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,16}$");
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка в регулярном выражении" + e.getDescription());
            return false;
        }

        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }
}
