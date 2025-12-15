public class MainTwo {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addProduct(new Product("Хлеб", 50));
        shop.addProduct(new Product("Молоко", 90));
        shop.addProduct(new Product("Хлеб", 50));
        shop.addProduct(new Product("Сыр", 300));
        shop.addProduct(new Product("Хлеб", 50));

        shop.printProducts();

        System.out.println("Общая сумма продаж = " + shop.getTotalSales() + " руб.");
        System.out.println("Самый популярный товар: " + shop.getMostPopularProduct());
    }

}
