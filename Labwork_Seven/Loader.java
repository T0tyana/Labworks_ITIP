class Loader extends Thread {
    private String name;
    private Warehouse warehouse;
    private static double totalWeight = 0;
    private static final Object lock = new Object();

    public Loader(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        System.out.println(name + " начал работу");

        while (warehouse.hasProducts()) {
            Product product = warehouse.getNextProduct();

            if (product == null) {
                break;
            }

            synchronized (lock) {
                if (totalWeight + product.getWeight() > 150) {
                    System.out.println(name + " сигнализирует, что набрано 150 кг. Грузчики едут на другой склад.");
                    deliverToOtherWarehouse();
                    totalWeight = 0;
                }

                totalWeight += product.getWeight();
                System.out.println(name + " взял: " + product + " | Текущий общий вес: " + String.format("%.2f", totalWeight) + " кг");
                if (Math.abs(totalWeight - 150.0) < 0.01) {
                    System.out.println(name + " сигнализирует: точно 150 кг. Грузчики едут на другой склад.");
                    deliverToOtherWarehouse();
                    totalWeight = 0;
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (lock) {
            if (totalWeight > 0 && !warehouse.hasProducts()) {
                System.out.println(name + " сигнализирует, что товары закончились. Последняя партия " + String.format("%.2f", totalWeight) + " кг едет на другой склад.");
                deliverToOtherWarehouse();
                totalWeight = 0;
            }
        }

        System.out.println(name + " завершил работу");
    }

    private void deliverToOtherWarehouse() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
