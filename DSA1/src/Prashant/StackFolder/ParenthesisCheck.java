package Prashant.StackFolder;

import java.util.Stack;

public class ParenthesisCheck {
    public static void main(String args[]){
        String parastr = "{()}[]]";
        boolean isBalenced = checkPara(parastr);
        if(isBalenced){
            System.out.println("it is balanced.");
        }else{
            System.out.println("it is not balanced.");
        }
    }

    private static boolean checkPara(String parastr) {
        int length = parastr.length();
        Stack<Character> stack=new Stack();
        if(length%2!=0){
            return false;
        }
        for(int i=0;i<length;i++){
            if(parastr.charAt(i)=='{'||parastr.charAt(i)=='['||parastr.charAt(i)=='('){
                stack.push(parastr.charAt(i));
            }else{
                if(!stack.isEmpty() ||stack.peek()==']'||stack.peek()==')'||stack.peek()=='}'){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
