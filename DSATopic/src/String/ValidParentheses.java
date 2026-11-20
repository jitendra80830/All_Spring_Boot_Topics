package String;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = ")(){}";
        boolean validParentheses = validParentheses(str);
        System.out.println(validParentheses);

    }

    private static boolean validParentheses(String str) { // ([])
        if(str.length()<2){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else {
                if (str.charAt(i) == ')') {
                    char ch = !stack.isEmpty()?stack.peek():' ';
                    if (ch == '(') {
                        stack.pop();
                    }else {
                        stack.push(str.charAt(i));
                    }

                }
                if (str.charAt(i) == '}') {
                    char ch = !stack.isEmpty()?stack.peek():' ';
                    if (ch == '{') {
                        stack.pop();
                    }else{
                        stack.push(str.charAt(i));
                    }
                }
                if (str.charAt(i) == ']') {
                    char ch = !stack.isEmpty()?stack.peek():' ';
                    if (ch == '[') {
                        stack.pop();
                    }else{
                        stack.push(str.charAt(i));
                    }

                }


            }
        }
        System.out.println(stack.size());
        if (stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
