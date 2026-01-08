package stack;

public class StackMethods {

    int top = -1;
    int max = 100;
    int[] stack = new int[max];

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == (max - 1)) {
            return true;
        }
        return false;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        stack[++top] = item;
        return true;
    }

    public void print() {
        int temp = top;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        while (temp != -1) {
            System.out.print(stack[temp--] + " ");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popData = stack[top];
        top--;
        return popData;
    }

    public int size() {
        if (isEmpty()) {
            return -1;
        }
        return top + 1;
    }
}
