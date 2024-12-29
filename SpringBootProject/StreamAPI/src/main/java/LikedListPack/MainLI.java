package LikedListPack;

public class MainLI {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ////1,2,3,4
        ////7,8,9,3
        list.addBeg(5);
        list.addBeg(3);
        list.addBeg(2);
        list.addBeg(1);
        list.print();
        LinkedList list1 = new LinkedList();
        list1.addBeg(3);
        list1.addBeg(9);
        list1.addBeg(8);
        list1.addBeg(7);
        System.out.println();
        list1.print();
        System.out.println();
        reverseLikedList(list);
        list.print();
        System.out.println();
        reverseLikedList(list1);
        list1.print();
        System.out.println();
        System.out.println(list.head.value+" "+list1.head.value);
        addTwoLikedList(list , list1);



    }

    //1 2 3 5
    private static LinkedList.Node reverseLikedList(LinkedList list) {
        LinkedList.Node prev = null;
        LinkedList.Node curr = list.head;//7 8 9 3
        while (curr!=null){
            LinkedList.Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        list.head = prev;
        return list.head;

    }
    //reverser two likedlist
    // We  iteeate on both list
    // get one by one node value from both list of start node
    // add these data a and store in var
    // here we have to  check after adding val , if there is carry then then store in other var
    // next time we check we have carry or not , if we have then add
    // after that if node id remaining on any list then add these val in actual added value

    private static void addTwoLikedList(LinkedList list, LinkedList list1) {
        /*System.out.println(list1.head.value);
        *//*1 2 3 5
          7 8 9 3*//*
        //9 1 2  8
        *//*5 3 2 1
        3 9 8 7*//*


        LinkedList.Node temp = list.head;
        while (temp!=null){
            temp.
        }*/
    }
}
