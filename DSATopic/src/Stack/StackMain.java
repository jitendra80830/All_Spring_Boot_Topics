package Stack;

public class StackMain {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        stack.pop();
        System.out.println("After popped peek");
        stack.printStack();
        System.out.println("Size of the stack: "+stack.size());
    }
}
