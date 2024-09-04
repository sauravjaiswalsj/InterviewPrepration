package begineer.LinkedListsJava.SinglyLinkedList;
//design linkedlist
public class LeetCode {
}

class MyLinkedList {

    class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        //System.out.println(size);
        if (index < 0 || index > size || head == null){
            return -1;
        }

        if (index == 0)
            return head.data;

        Node temp = head;
        int itr = 0;

        while (temp != null && itr <= index){
            if (itr == index){
                return temp.data;
            }
            ++itr;
            temp = temp.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);

        if (head == null){
            head = tail = node;
            ++size;
            return;
        }
        node.next = head;
        head = node;
        ++size;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null){
            head = tail = node;
            ++size;
            return;
        }

        tail.next = node;
        tail = node;
        ++size;
    }

    public void addAtIndex(int index, int value) {
        if (index < 0 || index > size){
            return;
        }
        if (index == size){
            addAtTail(value);
            return;
        }
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            ++size;
            return;
        }

        if (index == 0){
            addAtHead(value);
            return;
        }
        int itr = 0;

        Node curr = head;
        Node prev = null;

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

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size){
            return;
        }
        if (index == size-1){
            removeLast();
            return;
        }
        if (index == 0 ){
            int temp = removeFirst();
            return;
        }
        int itr = 0;

        Node curr = head;
        Node prev = null;

        while (curr != null && itr <= index){
            if (itr == index){
                int data = curr.data;
                prev.next = curr.next;
                curr = null;
                --size;
                return;
            }
            ++itr;
            prev = curr;
            curr = curr.next;
        }
        return;
    }

    public int removeLast(){
        if (head == null)
            return -1;

        if (head == tail){
            int data = head.data;
            head = tail = null;
            --size;
            return data;
        }

        Node curr = head;
        Node next = head.next;
        while (next.next != null){
            curr = next;
            next = next.next;
        }
        int data = next.data;
        curr.next = null;
        tail = curr;
        next = null;
        --size;
        return data;
    }

    public int removeFirst(){
        if (head == null)
            return -1;
        if (head == tail){
            int data = head.data;
            head = tail = null;
            --size;
            return data;
        }
        Node temp = head;
        int data = temp.data;
        head = head.next;
        temp = null;
        --size;
        return data;
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */