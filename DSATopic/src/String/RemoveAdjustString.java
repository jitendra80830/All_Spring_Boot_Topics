package String;

import java.util.Stack;

public class RemoveAdjustString {
    public static void main(String[] args) {
        String str = "abbaca";
        removeAddjs(str);
    }

    private static void removeAddjs(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            }else{
                if(stack.peek() == str.charAt(i)){
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }
            }
        }
        System.out.println(stack);
    }
}
