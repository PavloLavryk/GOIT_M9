import java.io.CharArrayReader;

public class Print  {
    public static void main(String[] args) {
        //реалізація методів MyArrayList
//        MyArrayList namesAL = new MyArrayList();
//        namesAL.add("Pavlo");
//        namesAL.add("Anastasiya");
//
//        namesAL.remove(1);
//
//        namesAL.size();
//
//        namesAL.get(0);
//
//        namesAL.clear();
//
//        //реалізація методів MyLinkedList
//        MyLinkedList namesLL = new MyLinkedList();
//
//        namesLL.add("Pavlo");
//        namesLL.add("Anastasiya");
//
//        namesLL.remove(1);
//
//        System.out.println(namesLL.size());
//
//        System.out.println(namesLL.get(0));
//        System.out.println(namesLL.get(1));
//
//        namesLL.clear();

        //реалізація методів MyQueue
//        MyQueue namesQ = new MyQueue();

//        namesQ.add("Pavlo");
//        namesQ.add("Anastasiya");
//
//        namesQ.size();
//
//        namesQ.peek();
//
//        namesQ.poll();
//
//        namesQ.clear();


        //реалізація методів MyStack
        MyStack namesS = new MyStack();

        namesS.push("Pavlo");
        namesS.push("Anastasiya");

        namesS.remove(1);

        namesS.size();

        namesS.peek();

        namesS.pop();

        namesS.clear();


        //реалізація методів MyHashMap
        MyHashMap namesHM = new MyHashMap();
        namesHM.put("Name1", "Pavlo");
        namesHM.put("Name2", "Anastasiya");

        namesHM.remove("Name1");

        namesHM.size();

        namesHM.get("Name2");

        namesHM.clear();



    }

}
