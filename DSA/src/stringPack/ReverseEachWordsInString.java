package stringPack;

import java.util.Arrays;

public class ReverseEachWordsInString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

    private static String reverseWords(String s) {
        String[] arrayS = s.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arrayS.length; i++) {
            String str = arrayS[i];
            String revered = reverseWord(str);
            sb.append(revered);
            if(i < arrayS.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private static String reverseWord(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] ch = str.toCharArray();

        while (i <ch.length / 2) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        StringBuffer sb = new StringBuffer();
        for (int k = 0; k < ch.length; k++) {
            sb.append(ch[k]);
        }
        return sb.toString();
    }
}
