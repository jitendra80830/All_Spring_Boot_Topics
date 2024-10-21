package String;
/*
Given two strings s and goal, return true
 if and only if s can become goal after some number of shifts on s.
*/

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goals = "cdeab";
        System.out.println(rotateString(s , goals));
    }

    private static boolean rotateString(String s, String goals) {

        char[] ch = s.toCharArray();
        for (int i = 0; i <ch.length; i++) {
            char leftChar = ch[0];
            for (int j = 0; j <ch.length-1 ; j++) {
                ch[j] = ch[j+1];
            }
            ch[ch.length-1] = leftChar;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <ch.length ; j++) {
                sb.append(ch[j]);
            }
            String ans ="";
            if(sb.toString().equals(goals)){
                return true;

            }
        }
        return false;
    }
}
