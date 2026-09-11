import java.util.Stack;

public class RemoveStar {
    public static void main(String[] args) {
        String str = "erase*****";
        String ans = removeStar(str);
        System.out.println(ans);
    }

    private static String removeStar(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='*'){
                stack.push(str.charAt(i));
            }else {
                if(str.charAt(i)=='*' && !stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }
        return sb.reverse().toString();
    }
}
