package LikedListPack;

//    /
/*Node {
 int value ,
    Node next
    }*/

//1,2,3,4
//7,8,9,3
public class LinkedList {

    class Node{
        int value;
        Node next;
        Node(int item){
            this.value = item;
            this.next = null;
        }
    }
    Node head = null;

    public Node addBeg(int item){
        Node newNode = new Node(item);
        if(head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;

        }
        return head;
    }
    public void print(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }


}
