class Warehouse {
    private Product[] products;
    private int currentIndex = 0;

    public Warehouse(Product[] products) {
        this.products = products;
    }

    public synchronized Product getNextProduct() {
        if (currentIndex >= products.length) {
            return null;
        }

        Product product = products[currentIndex];
        currentIndex++;
        return product;
    }

    public boolean hasProducts() {
        return currentIndex < products.length;
    }

    public int getRemainingCount() {
        return Math.max(0, products.length - currentIndex);
    }
}
