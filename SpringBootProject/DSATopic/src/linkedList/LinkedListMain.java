package linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListMethods lKob = new LinkedListMethods();
        lKob.addFromBeginingNode(20);
        lKob.addFromBeginingNode(20);
        lKob.addFromBeginingNode(24);
        lKob.addFromBeginingNode(25);
        lKob.addFromBeginingNode(39);
        //lKob.addAtEnd(20);
        //lKob.addAtEnd(23);
        //lKob.printNodes(lKob.head);
        //lKob.addAtEnd(99);
        System.out.println("=================================");
/*
        lKob.printNodes(lKob.head);
*/
        //lKob.addAfterData(lKob.head ,24 ,50);
        /*lKob.printNodes(lKob.head);
        lKob.reverseLinkedList();
        System.out.println();
        lKob.printNodes(lKob.head);
        System.out.println();
        System.out.println("Mid node");
        Node midNode = lKob.findMidNode();
        System.out.println(midNode.data)*/;
        //lKob.removeElements(20);
        lKob.printNodes(lKob.head);
       lKob.deleteDuplicateNode();
        System.out.println();
        lKob.printNodes(lKob.head);


    }
}
