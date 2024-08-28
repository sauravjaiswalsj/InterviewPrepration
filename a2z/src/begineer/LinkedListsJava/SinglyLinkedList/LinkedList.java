package begineer.LinkedListsJava.SinglyLinkedList;

import java.util.List;

public class LinkedList<E>{
    class Node<E> {
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

    public int getSize() {
        return size;
    }

    // add First
    public void addFirst(E data){
        Node<E> node = new Node<>(data);
        if (head == null){
            head = tail = node;
            ++size;
            return;
        }
        node.next = head;
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
            E temp = head.data;
            head = head.next;
            --size;
            return temp;
    }

    public E removeLast(){
        if (head == null)
            return null;
        Node<E> curr = head;
        Node<E> prev = null;

        E temp = tail.data;

        while (curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        tail = prev;
        --size;
        return temp;
    }

    public E remove(E data){
        
    }

    public void display(){
        Node<E> temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
