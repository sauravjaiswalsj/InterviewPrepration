package begineer.LinkedListsJava.SinglyLinkedList;

public class Application {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        addTest(linkedList);
        linkedList.display();

        for (int i = 0; i < 5; i++)
            linkedList.removeFirst();
        linkedList.display();
        for (int i = 0; i < 5; i++)
            linkedList.removeLast();
        linkedList.display();

        addTest(linkedList);

        for (int i = 70; i >= 20; i-=10){
            linkedList.remove(i);
        }

        linkedList.display();
    }
    private static void addTest(LinkedList<Integer> linkedList){
        for (int i = 50; i >= 10; i-=10)
            linkedList.addFirst(i);

        for (int i = 60; i <= 100; i+=10)
            linkedList.addLast(i);
    }
}
