package stack;

public class Main {
    public static void main(String[] args) {
        StackMethods stack = new StackMethods();
        stack.push(2);
        stack.push(44);
        stack.push(1);
        stack.push(6);
        stack.push(22);
        stack.push(99);
        stack.print();
        int pop = stack.pop();
        System.out.println();
        System.out.println(pop);
        stack.print();
    }
}
