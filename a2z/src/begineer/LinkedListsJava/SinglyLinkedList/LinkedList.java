package begineer.LinkedListsJava.SinglyLinkedList;

public class LinkedList<E> {
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

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public void display(){
        Node<E> itr = head;

        while (itr != null){
            System.out.print(itr.data + " ");
            itr = itr.next;
        }
        System.out.println();
    }

    public void tailDebug(){
        E temp = tail.data;
        System.out.println(temp);
    }
    public void addFirst(E data){
        Node<E> node = new Node(data);
        if (head == null){
            head = tail = node;
            ++size;
            return;
        }
        node.next = head;
        head = node;
        ++size;
    }

    public void addLast(E data) {
        Node<E> node = new Node(data);
        if (head == null){
            head = tail = node;
            ++size;
            return;
        }

        tail.next = node;
        tail = node;
        ++size;
    }

    public E get(int index){
        if ((index < 0 || index > size) || head == null){
            return null;
        }
        if (index == 0)
            return head.data;

        Node<E> temp = head;
        int itr = 0;
        while (temp != null && itr <= index){
            if (itr == index)
                return temp.data;
            temp = temp.next;
            ++itr;
        }
        return null;
    }

    public void set(int index, E value){
        if (index < 0 || index > size || head == null)
            return;
        if (index == 0){
            head.data = value;
            return;
        }

        Node<E> temp = head;
        int itr = 0;
        while (temp != null && itr <= index){
            if (itr == index){
                temp.data = value;
                return;
            }
            temp = temp.next;
            ++itr;
        }
    }

    public E removeFirst(){
        if (head == null)
            return null;
        if (head == tail){
            E data = head.data;
            head = tail = null;
            --size;
            return data;
        }
        Node<E> temp = head;
        E data = temp.data;
        head = head.next;
        temp = null;
        --size;
        return data;
    }

    public E removeLast(){
        if (head == null)
            return null;

        if (head == tail){
            E data = head.data;
            head = tail = null;
            --size;
            return data;
        }

        Node<E> curr = head;
        Node<E> next = head.next;
        while (next.next != null){
            curr = next;
            next = next.next;
        }
        E data = next.data;
        curr.next = null;
        tail = curr;
        next = null;
        --size;
        return data;
    }

    public void add(int index, E value){
        if (index < 0){
            return;
        }
        if (index > size){
            addLast(value);
            return;
        }
        Node<E> node = new Node(value);
        if (head == null){
            head = tail = node;
            ++size;
            return;
        }

        if (index == 0){
            addFirst(value);
            return;
        }
        int itr = 0;

        Node<E> curr = head;
        Node<E> prev = null;

        while (curr != null && itr <= index){
            if (itr == index){
                node.next = curr;
                prev.next = node;
                ++size;
                return;
            }
            ++itr;
            prev = curr;
            curr = curr.next;
        }
    }

    public E remove(int index){
        if (index < 0 || index > size){
            return null;
        }
        if (index == size){
            E temp = removeLast();
            return temp;
        }
        if (index == 0 ){
            E temp = removeFirst();
            return temp;
        }
        int itr = 0;

        Node<E> curr = head;
        Node<E> prev = null;

        while (curr != null && itr <= index){
            if (itr == index){
                E data = curr.data;
                prev.next = curr.next;
                curr = null;
                --size;
                return data;
            }
            ++itr;
            prev = curr;
            curr = curr.next;
        }
        return null;
    }
}
