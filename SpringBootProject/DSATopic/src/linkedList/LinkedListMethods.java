package linkedList;

class Node {
    Node next;
    Integer data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMethods {
    Node head = null;

    public void addFromBeginingNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printNodes(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            //newNode.next = null;
        }
    }
    public void addAfterData(Node head ,int exixtData , int newData){
        if(head == null){
            System.out.println("Data is not available in list.");
        }
        Node temp = head;
        while (temp !=null){
            if(temp.data == exixtData){
                Node newNode = new Node(newData);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
    }

    public void reverseLinkedList() {

        Node prev = head;
        Node curr = head.next;
        while (curr!=null){
            Node nxt = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nxt;
        }
        head.next = null;
        head= prev;
    }

    public Node findMidNode() {
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public void removeElements(int val) {
        Node temp1 = new Node(0);
        Node curr = temp1;
        Node temp = head;
        while (temp!=null){
            if(temp.data!=val){
                curr.next = temp;
                curr = curr.next;
            }
            temp = temp.next;
        }
        curr.next = null;
        head = temp1.next;
    }
    /*public boolean isPalindrome(Node node){
        if(node == null){
            return false;
        }
        Node mid = findMidNode();
        this.head = mid;
        reverseLinkedList();

    }*/

    public void deleteDuplicateNode(){
        Node curr = this.head;
        while (curr!=null){
            Node temp = curr;
            while (temp!=null && curr.data == temp.data){
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }
}
