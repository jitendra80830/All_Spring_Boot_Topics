package Prashant.StackFolder;

import java.util.Stack;

public class NormalFunctionForStack {
    public static void main(String args[]){
        //Stack<Integer> stact= new Stack<>(); //Creating non generic type stack
        Stack stack= new Stack();
        //pushing element into stack
        stack.push(1);
        stack.push("Ram");
        stack.push(3L);
        stack.push(4f);
        stack.push(true);
        //poping element from stack
        stack.pop();// this function will use to delete top most element from the stack.
        //The method removes an element from the top of the stack and returns the same element as the value of that function.
        //System.out.println(stack.peek());//this function is use to select the top most element from the stack. Note it will happen without removing element.
        //System.out.println(stack.empty());//it will return true if stack will empty.
       // System.out.println(stack.search("Ram"));//it will return the index

    }
}
