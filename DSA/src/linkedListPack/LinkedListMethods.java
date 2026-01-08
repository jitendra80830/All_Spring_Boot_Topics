package linkedListPack;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMethods {
    private Node head;

    public void addBegin(int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addLast(int item) {
        Node newNode = new Node(item);
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void reverse() {
        Node prev = null;
        Node curr = this.head;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        this.head = prev;
    }

    public Node mergeTwoLists(LinkedListMethods list1, LinkedListMethods list2) {
        Node node1 = list1.head;
        Node node2 = list2.head;

        Node temp = new Node(0);
        Node curr = temp;

        while (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                curr.next = node1;
                node1 = node1.next;
            } else {
                curr.next = node2;
                node2 = node2.next;
            }
            curr = curr.next;
        }
        while (node1!=null){
            curr.next = node1;
            curr = curr.next;
        }

        while (node2!=null){
            curr.next = node2;
            curr = curr.next;
        }
        //this.head = temp.next;
        return temp.next;

    }

}
