package begineer.LinkedListsJava.DoublyLinkedList;

class DoublyLinkedList<E>{
     class Node<E>{
         E data;
         private Node<E> prev;
         private Node<E> next;

         public Node(E data){
             this.data = data;
             this.prev = null;
             this.next = null;
         }
     }
     private Node<E> head;
     private Node<E> tail;
     private int size;

     public DoublyLinkedList(){
         this.size = 0;
         this.head = null;
         this.tail = null;
     }

     public int size(){
         return size;
     }

     public void addFirst(E data){
         Node<E> node = new Node<E>(data);
         if (head == null){
             tail = node;
             head = node;
             return;
         }
         node.next = head;
         head = node;
         ++size;
     }

     public void display(){
         Node<E> temp = head;
         while (temp != null){
             System.out.println(temp.data);
             temp = temp.next;
         }
     }
}
public class DLL {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        for (int i = 10; i >= 1; i--){
            doublyLinkedList.addFirst(i);
        }

        doublyLinkedList.display();
    }
}
