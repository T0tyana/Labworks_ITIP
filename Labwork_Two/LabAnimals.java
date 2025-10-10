package animals;
import java.util.Scanner;

public class LabAnimals {
    public static void main(String[] args) {
        Cat catOne = new Cat("Кузьма", 3, 4.5, true, "серый", "Британец", true, 7);
        Cat catTwo = new Cat();
        Parrot parrot = new Parrot("Кеша", 2, 0.4, true, 0.25, 100, "зелёный", true);
        Fish fish = new Fish("Немо", 1, 0.1, "пресная", 2, "рыба-клоун", "оранжевый", 10.0);

        System.out.println("Счётчик кошек (после создания cat1, cat2): " + Cat.getCatCount());

        Animal[] animals = new Animal[]{catOne, parrot, fish, catTwo};
        System.out.println("\nДемонстрация полиморфизма и общих действий");
        for (Animal a : animals) {
            System.out.println("\n" + a);
            a.makeSound();
            a.move();
            a.eat("корм");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nХотите создать новую кошку вручную? (y/n): ");
        String answer = scanner.nextLine().trim();
        if (answer.equalsIgnoreCase("y")) {
            System.out.print("Имя: ");
            String name = scanner.nextLine();
            System.out.print("Возраст (целое): ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Вес (double): ");
            double weight = Double.parseDouble(scanner.nextLine());
            System.out.print("Есть ли шерсть? (true/false): ");
            boolean hasFur = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Цвет шерсти: ");
            String furColor = scanner.nextLine();
            System.out.print("Порода: ");
            String breed = scanner.nextLine();
            System.out.print("Домашняя? (true/false): ");
            boolean isIndoor = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Острота когтей (1-10): ");
            int sharpness = Integer.parseInt(scanner.nextLine());

            Cat userCat = new Cat(name, age, weight, hasFur, furColor, breed, isIndoor, sharpness);
            System.out.println("Создана кошка: " + userCat);
            System.out.println("Счётчик кошек (теперь): " + Cat.getCatCount());
            //userCat.setAge(3);
            //System.out.println("Теперь возраст последней созданной кошки: " + userCat.getAge());
            
        }

        scanner.close();
    }
}