package TreePack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    Scanner sc = new Scanner(System.in);

    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public Tree() {
        this.root = createTree(null, false);
    }

    private Node createTree(Node parent, boolean ilc) {
        if (parent == null) {
            System.out.println("Enter the data for root the node");
        } else {
            if (ilc) {
                System.out.println("Enter the left child data for " + parent.data);
            } else {
                System.out.println("Enter the right child for " + parent.data);
            }
        }
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        System.out.println("Want to left child for " + nn.data);
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree(nn, true);
        }
        System.out.println("Want to right child for " + nn.data);
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree(nn, false);
        }
        return nn;

    }

    public void display() {
        display(this.root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }
        String ans = "";
        if (root.left != null) {
            ans += root.left.data + ".<- ";
        } else {
            ans += ".";
        }
        ans += root.data;
        if (root.right != null) {
            ans += "->"+root.right.data;
        } else {
            ans += ".";
        }
        System.out.println(ans);
        display(root.left);
        display(root.right);
    }
    public void max(){
        int max = max(this.root);
        System.out.println(max);
    }
    private int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int left_max = max(node.left);
        int right_max = max(node.right);

        return Math.max(left_max , Math.max(right_max , node.data));

    }

    public void ht(){
        int ht = ht(this.root);
        System.out.println(ht);
    }
    private int ht(Node node){
        if(node == null){
            return -1;
        }
        int left_ht = ht(node.left);
        int right_ht = ht(node.right);

        return Math.max(left_ht,right_ht)+1;
    }
    public int size(){
        return size(this.root);
    }

    private int size(Node root) {
        if(root == null){
            return 0;
        }

        int left_size = size(root.left);
        int right_size = size(root.right);

        return (left_size + left_size) +1;
    }
    public boolean find(int item){
        return find(this.root , item);
    }
    private boolean find(Node root , int item){
        if(root == null){
            return false;
        }
        if(root.data == item){
            return true;
        }
        boolean left = find(root.left, item);
        boolean riht = find(root.right, item);
        return left || riht;
    }
    public void preOrderTraversal(){
        preOrderTraversal(this.root);
    }
    private void preOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data +" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void postOrderTraversal(){
        postOrderTraversal(this.root);
    }
    private void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }
    public void inOrderTraversal(){
        inOrderTraversal(this.root);
    }
    private void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public void levelOrderTraversal(){
        levelOrderTraversal(this.root);
    }
    private void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node node = q.remove();
            System.out.print(node.data+" ");
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
        }
    }
}
