package JavaProject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ExceptionLogger {
    
    private static final String LOG_FILE = "JavaProject/log.txt";

    public static void log(Exception e) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(LocalDateTime.now() + " - " + e.getClass().getName() + ": " + e.getMessage() + "\n");
        } catch (IOException io) {
            System.out.println("Ошибка записи в файл лога: " + io.getMessage());
        }
    }
}
