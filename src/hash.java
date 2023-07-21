public class hash<K, V> {

    private Node<K, V> head;
    private int size;

    public hash() {
        head = null;
        size = 0;
    }

    public void put(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value, null);
        if (head == null) {
            head = newNode;
        } else {
            Node<K, V> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public V remove(K key) {
        if (head == null) {
            return null;
        }
        Node<K, V> currentNode = head;
        Node<K, V> prevNode = null;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                if (prevNode == null) {
                    head = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                size--;
                return currentNode.value;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        if (head == null) {
            return null;
        }
        Node<K, V> currentNode = head;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    private static class Node<K, V> {

        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}