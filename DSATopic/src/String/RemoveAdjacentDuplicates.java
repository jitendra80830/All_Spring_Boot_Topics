package String;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "azxxzy";
        String adjacentDuplicates = removeAdjacentDuplicates(str);
        System.out.println(adjacentDuplicates);
    }

    private static String removeAdjacentDuplicates(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.isEmpty()) {
                st.push(str.charAt(i));
            } else {
                if (st.peek() == str.charAt(i)) {
                    st.pop();
                } else {
                    st.push(str.charAt(i));
                }
            }
        }
        String temp = "";
        while (!st.isEmpty()) {
            temp = temp + st.peek();
            st.pop();
        }
        String ans = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            ans = ans += temp.charAt(i);
        }
        return ans;
    }
}
