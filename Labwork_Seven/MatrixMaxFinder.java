public class MatrixMaxFinder extends Thread {
    private double[] row;
    private double rowMax;

    public MatrixMaxFinder(double[] row) {
        this.row = row;
    }

    @Override
    public void run() {
        rowMax = row[0];
        for (double elem : row) {
            if (elem > rowMax) {
                rowMax = elem;
            }
        }
        System.out.println("Поток " + getName() + " нащёл максимум. Он равен: " + rowMax);
    }

    public double getRowMax() {
        return rowMax;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {12.5, 8.3, 15.7, 4.2},
            {3.2, 25.1, 9.8, 18.4},
            {7.4, 18.6, 11.2, 30.5}            
        };

        MatrixMaxFinder[] threads = new MatrixMaxFinder[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            threads[i] = new MatrixMaxFinder(matrix[i]);
            threads[i].setName("Thread_Row-" + (i + 1));
        }

        for (MatrixMaxFinder thread : threads) {
            thread.start();
        }
        
        try {
            for (MatrixMaxFinder thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        double globalMax = threads[0].getRowMax();
        for (int i = 0; i < threads.length; i++) {
            double rowMax = threads[i].getRowMax();

            if (rowMax > globalMax) {
                globalMax = rowMax;
            }
        }

        System.out.println("Наибольший элемент во всей матрице: " + globalMax);
    }
}
