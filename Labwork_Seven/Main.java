public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Холодильник", 45.5),
            new Product("Стиральная машина", 32.0),
            new Product("Телевизор", 15.2),
            new Product("Микроволновка", 12.8),
            new Product("Пылесос", 7.3),
            new Product("Компьютер", 8.9),
            new Product("Диван", 62.4),
            new Product("Кресло", 28.7),
            new Product("Стол", 22.1),
            new Product("Стул", 6.5),
            new Product("Шкаф", 55.3),
            new Product("Ковёр", 18.9),
            new Product("Кондиционер", 25.6),
            new Product("Бойлер", 30.2),
            new Product("Велосипед", 17.8)            
        };

        System.out.println("Симуляция работы склада");
        System.out.println("На складе " + products.length + " товаров");
        double totalWeight = 0;
        for (Product p : products) {
            System.out.println(" " + p);
            totalWeight += p.getWeight();
        }
        System.out.println("Общий вес всех товаров: " + String.format("%.2f", totalWeight) + " кг");

        Warehouse warehouse = new Warehouse(products);

        Loader loader1 = new Loader("Грузчик-1", warehouse);
        Loader loader2 = new Loader("Грузчик-2", warehouse);
        Loader loader3 = new Loader("Грузчик-3", warehouse);

        loader1.start();
        loader2.start();
        loader3.start();

        try{
            loader1.join();
            loader2.join();
            loader3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все товары перемещены");
    }
}
