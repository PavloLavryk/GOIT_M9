public class MyHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private Node<K, V>[] table;
    private int size;
    private int threshold;
    private float loadFactor;

    public MyHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int initialCapacity, float loadFactor) {
        table = new Node[initialCapacity];
        this.loadFactor = loadFactor;
        threshold = (int) (initialCapacity * loadFactor);
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = hash % table.length;

        Node<K, V> node = new Node<>(key, value);
        Node<K, V> current = table[index];

        if (current == null) {
            table[index] = node;
        } else {
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = node;
        }

        size++;

        if (size >= threshold) {
            resize();
        }
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = hash % table.length;

        Node<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public void remove(K key) {
        int hash = key.hashCode();
        int index = hash % table.length;

        Node<K, V> current = table[index];
        Node<K, V> previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                break;
            }
            previous = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    private void resize() {
        Node<K, V>[] newTable = new Node[table.length * 2];
        threshold = (int) (newTable.length * loadFactor);

        for (Node<K, V> node : table) {
            while (node != null) {
                int index = node.key.hashCode() % newTable.length;
                Node<K, V> next = node.next;
                node.next = newTable[index];
                newTable[index] = node;
                node = next;
            }
        }

        table = newTable;
    }

    private static class Node<K, V> {

        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }
}