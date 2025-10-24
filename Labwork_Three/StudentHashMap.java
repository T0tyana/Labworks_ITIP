import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;

    public Student(String firtsName, String lastName, int age, double averageGrade) {
        this.firstName = firtsName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " (Возраст: " + age + ", Средний балл: " + averageGrade + ")";
    }
}

public class StudentHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Student> studentMap = new HashMap<>();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("(1) Добавить студента");
            System.out.println("(2) Найти студента по номеру зачетки");
            System.out.println("(3) Удалить студента");
            System.out.println("(4) Показать всех студентов");
            System.out.println("(0) Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();       
            
            switch (choice) {
                case 1:
                    System.out.print("Введите номер зачетки: ");
                    String id = scanner.nextLine();
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите фамилию: ");
                    String surname = scanner.nextLine();
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    System.out.print("Введите средний балл: ");
                    double avg = scanner.nextDouble();
                    
                    studentMap.put(id, new Student(name, surname, age, avg));
                    System.out.println("Студент добавлен!");
                    break;
                
                case 2:
                    System.out.print("Введите номер зачетки: ");
                    id = scanner.nextLine();
                    Student found = studentMap.get(id);
                    if (found != null) {
                        System.out.println("Найден студент: " + found);
                    } else {
                        System.out.println("Студент не найден");
                    }
                    break;
                
                case 3:
                    System.out.println("Введите номер зачётки для удаления: ");
                    id = scanner.nextLine();
                    if (studentMap.remove(id) != null) {
                        System.out.println("Студент удалён");
                    } else {
                        System.out.println("Студент с таким номером не найден");
                    }   
                    break;
                
                case 4:
                    if (studentMap.isEmpty()) {
                        System.out.println("Таблица пуста");
                    } else {
                        System.out.println("Все студенты: ");
                        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
                            System.out.println(entry.getKey() + " -> " + entry.getValue());
                        }
                    }
                break;

                case 0:
                    System.out.println("Завершение работы программы");
                    scanner.close();
                    return;

                default:
                System.out.println("Неверный выбор, попробуйте снова");    
            }
        }
    }
}
