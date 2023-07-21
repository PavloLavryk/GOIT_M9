public class MyHashMap<K, V> {

    private Node<K, V>[] table;
    private int size;

    public MyHashMap() {
        table = new Node[16];
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
        table = new Node[16];
        size = 0;
    }

    private class Node<K, V> {

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