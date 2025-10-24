import java.util.LinkedList;

public class HashTable<K, V> {
    
    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry (K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V value) {
            this.value = value;
        }
    }

    private static final int capacity = 10;
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public HashTable() {
        table = new LinkedList[capacity];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<Entry<K, V>>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V> (key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + ": ");
            if (table[i] != null) {
                for (Entry<K, V> entry : table[i]) {
                    System.out.print("[" + entry.getKey() + " = " + entry.getValue() + "] ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] arhs) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("apple", 5);
        hashTable.put("banana", 3);
        hashTable.put("orange", 7);
        hashTable.put("pear", 2);

        hashTable.printTable();

        System.out.println("\nКоличество элементов: " + hashTable.size());
        System.out.println("Значение по ключу 'banana': " + hashTable.get("banana"));

        hashTable.remove("orange");
        System.out.println("\nПосле удаления 'orange':");
        hashTable.printTable();        
    }
}
