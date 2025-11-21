import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenCloseReadWriteErrors {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("input.txt");
            output = new FileOutputStream("output.txt");

            int data;
            try {
                while ((data = input.read()) != -1) {
                    output.write(data);
                }
                System.out.println("Копирование завершено успешно");
            } catch (IOException e) {
                System.out.println("Ошибка при чтении или записи файла");
                System.out.println(e.getMessage());
            }

        
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: не удалось открыть один из файлов");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (input != null) input.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии входного файла");
            }
            
            try {
                if (output != null) output.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии выходного файла");
            }
        }
    }    
}
