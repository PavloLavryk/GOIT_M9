public class Print  {
    public static void main(String[] args) {
        {
            MyArrayList<Integer> myArrayList = new MyArrayList<>();
            int elementsToAdd = 1000;
            for (int i = 0; i < elementsToAdd; i++) {
                myArrayList.add(i);
            }

            System.out.println("Size: " + myArrayList.size());

            int indexToGet = 100;
            int value = myArrayList.get(indexToGet);
            System.out.println("Value at index " + indexToGet + ": " + value);

            int indexToRemove = 500;
            myArrayList.remove(indexToRemove);
            System.out.println("Removed element at index " + indexToRemove);

            System.out.println("Size after removal: " + myArrayList.size());

            myArrayList.clear();
            System.out.println("Cleared. Size: " + myArrayList.size());
        }

        {
            MyHashMap<Integer, String> myHashMap = new MyHashMap<>();

            int elementsToAdd = 1000;
            for (int i = 0; i < elementsToAdd; i++) {
                myHashMap.put(i, "Value_" + i);
            }

            System.out.println("Size: " + myHashMap.size());

            int keyToGet = 100;
            String value = myHashMap.get(keyToGet);
            System.out.println("Value for key " + keyToGet + ": " + value);

            int keyToRemove = 500;
            String removedValue = myHashMap.remove(keyToRemove);
            System.out.println("Removed value for key " + keyToRemove + removedValue);

            System.out.println("Size after removal: " + myHashMap.size());

            myHashMap.clear();
            System.out.println("Cleared. Size: " + myHashMap.size());
        }
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();


        {
            int elementsToAdd = 1000;
            for (int i = 0; i < elementsToAdd; i++) {
                myLinkedList.add(i);
            }

            System.out.println("Size: " + myLinkedList.size());

            int indexToGet = 100;
            int value = myLinkedList.get(indexToGet);
            System.out.println("Value at index " + indexToGet + ": " + value);

            int indexToRemove = 500;
            myLinkedList.remove(indexToRemove);
            System.out.println("Removed element at index " + indexToRemove);

            System.out.println("Size after removal: " + myLinkedList.size());

            myLinkedList.clear();
            System.out.println("Cleared. Size: " + myLinkedList.size());
        }
        {
            MyQueue<Integer> myQueue = new MyQueue<>();

            int elementsToAdd = 1000;
            for (int i = 0; i < elementsToAdd; i++) {
                myQueue.add(i);
            }

            System.out.println("Size: " + myQueue.size());

            int firstElement = myQueue.peek();
            System.out.println("First element: " + firstElement);

            int removedElement = myQueue.poll();
            System.out.println("Removed element: " + removedElement);

            System.out.println("Size after removal: " + myQueue.size());

            myQueue.clear();
            System.out.println("Cleared. Size: " + myQueue.size());
        }
        {
            MyStack<Integer> myStack = new MyStack<>();

            int elementsToAdd = 1000;
            for (int i = 0; i < elementsToAdd; i++) {
                myStack.push(i);
            }

            System.out.println("Size: " + myStack.size());

            int topElement = myStack.peek();
            System.out.println("Top element: " + topElement);

            int removedElement = myStack.pop();
            System.out.println("Removed element: " + removedElement);

            System.out.println("Size after removal: " + myStack.size());

            myStack.clear();
            System.out.println("Cleared. Size: " + myStack.size());
        }

    }

}
