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
        System.out.println("All Element");

        linkedList.display();
        System.out.println("Remove Element");
        for (int i = 70; i >= 20; i-=10){
            try{
                int x = linkedList.remove(i);
                System.out.print(x+ " ");
            }
            catch (NullPointerException e){
                System.out.println("Not Present: "+ i);
                linkedList.display();
            }
        }
        System.out.println();
        linkedList.display();

        System.out.println(linkedList.size());

        linkedList.add(110,5);
        linkedList.display();
    }

    private static void addTest(LinkedList<Integer> linkedList){
        for (int i = 50; i >= 10; i-=10)
            linkedList.addFirst(i);

        for (int i = 60; i <= 100; i+=10)
            linkedList.addLast(i);
    }
}
