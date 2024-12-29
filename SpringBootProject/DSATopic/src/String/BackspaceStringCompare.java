package String;

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        String s= "ab#c";
        String t = "ad#c";

        System.out.println(backspaceStringCompare(s ,t));
    }

    private static boolean backspaceStringCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == '#' && !s1.isEmpty()){
                s1.pop();
            }else {
                if(s.charAt(i) != '#'){
                    s1.push(s.charAt(i));
                }
            }

        }
        for (int i = 0; i <s.length() ; i++) {
            if(t.charAt(i) == '#' && !s2.isEmpty()){
                s2.pop();
            }else {
                if(t.charAt(i) != '#'){
                    s2.push(t.charAt(i));
                }
            }
        }
        String ans = "";
        while (!s1.isEmpty()){
            ans = ans+=s1.peek();
            s1.pop();
        }
        String ans2 = "";
        while (!s2.isEmpty()){
            ans2 = ans2+=s2.peek();
            s2.pop();
        }
        //System.out.println(ans+"  : "+ans2);

        if(ans2.equals(ans)){
            return true;
        }else {
            return false;
        }
    }
}
