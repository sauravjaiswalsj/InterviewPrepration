package begineer.LinkedListsJava;

class LL<E>{
    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LL(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public void addFirst(E data){
        Node<E> node = new Node<E>(data);
        node.next = head;
        if (node.next == null)
            tail = node;
        head = node;
        ++size;
    }

    public void addLast(E data){
        Node<E> node = new Node<>(data);

        if (head == null){
            head = tail = node;
            ++size;
            return;
        }

        tail.next = node;
        tail = node;
        ++size;
    }

    public E removeFirst(){
        if (head == null)
            return null;
        E data = head.data;
        if (head == tail)
            head = tail = null;
        else
            head = head.next;
        --size;
        return data;
    }

    public E removeLast(){
        if (tail == head)
            head = tail = null;

        Node<E> current = head;
        Node<E> previous = null;

        while (current != tail){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        tail = previous;
        --size;
        return current.data;
    }
    public E remove(E data){
        if (head == null)
            return null;
        Node<E> current = head;
        Node<E> previous = null;
        Node<E> nextPtr = head.next;

        while (nextPtr != null){
            if (((Comparable<E>) data).compareTo(current.data) != 0){
                previous = current;
                current = nextPtr;
            }
            nextPtr = nextPtr.next;
        }
        E temp = current.data;
        current.next = null;
        previous.next = nextPtr;
        --size;
        return temp;
    }

    public E peekFirst(){
        if (head == null)
            return null;
        return head.data;
    }
    public E peekLast(){
        if (tail == null)
            return null;
        return tail.data;
    }

    public boolean contains(E data){
        if (head == null)
            return false;

        Node<E> temp = head;

        while(temp != null){
            if (((Comparable<E>) data).compareTo(temp.data) == 0){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void display(){
        Node<E> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}


public class TailPointerImplementation {
    public static void main(String[] args) {
        LL<Integer> list = new LL<>();
        list.addFirst(5);
        list.addFirst(10);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(6);
        list.addFirst(1);

        list.display();

        System.out.println("remove");
        list.remove(1);
        System.out.println(list.contains(1));
        list.display();
    }
}
