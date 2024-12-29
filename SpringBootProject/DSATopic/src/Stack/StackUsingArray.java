package Stack;

public class StackUsingArray {

   private int top = -1;
    public int max = 100;
    public int stack[] = new int[max];

    public boolean isFull(){
        if(top == (max-1)){
            return true;
        }
        return false;
    }

    public boolean push(int data){
        if(isFull()){
            return false;
        }
        stack[++top] = data;
        return true;
    }
    public boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }
    public void printStack(){
        int temp  = top;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        while (temp!=-1){
            System.out.println(stack[temp]);
            temp--;
        }
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int poppedData = stack[top];
        top--;
        return poppedData;
    }
    public int size(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top+1;
    }

}
