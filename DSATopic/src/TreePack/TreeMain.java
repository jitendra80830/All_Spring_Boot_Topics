package TreePack;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.display();
        int size = tree.size();
        System.out.println("Size of the tree "+ size);
        boolean findValue = tree.find(100);
        System.out.println(findValue);
        /*tree.preOrderTraversal();
        System.out.println();
        tree.postOrderTraversal();*/
        tree.levelOrderTraversal();
    }

}
