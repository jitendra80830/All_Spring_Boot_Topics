package Prashant.StackFolder;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String args[]){
        int[] att={1,2,3,4,5};
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i< att.length;i++){
            stack.push(att[i]);
        }
        int i=0;
        while(!stack.isEmpty()){
            int top= stack.peek();
            att[i]=top;
            stack.pop();
            i++;
        }
        for(int k=0;k<att.length;k++){
            System.out.println(att[k]);
        }
    }
}
