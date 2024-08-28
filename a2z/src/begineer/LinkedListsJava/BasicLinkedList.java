package begineer.LinkedListsJava;

class LinkedList<E>{
    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    private Node<E> head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public void addFirst(E data){
        Node<E> node = new Node<E>(data);
        node.next = head;
        head = node;
        ++size;
    }

    public void addLast(E data){
        Node<E> node = new Node<>(data);

        if (head == null){
            head = node;
            ++size;
            return;
        }

        Node<E> temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
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
public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(5);
        list.addFirst(10);
        list.addLast(2);
        System.out.println(list.size());
        list.display();
    }
}
