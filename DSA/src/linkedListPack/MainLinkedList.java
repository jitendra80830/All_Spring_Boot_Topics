package linkedListPack;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedListMethods list = new LinkedListMethods();
        list.addBegin(2);
        list.addBegin(44);
        list.addBegin(24);
        list.addBegin(5);
        list.addBegin(9);
        list.print();
        list.addLast(70);
        list.addLast(90);
        System.out.println();
        list.print();
        list.reverse();
        System.out.println();
        list.print();
     /*   LinkedListMethods l1 = new LinkedListMethods();
        l1.addBegin(4);
        l1.addBegin(2);
        l1.addBegin(1);
        LinkedListMethods l2 = new LinkedListMethods();
        l2.addBegin(4);
        l2.addBegin(3);
        l2.addBegin(1);
        list.mergeTwoLists(l1 ,l2);
        l1.print();*/

    }
}
