package hashMap;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class ReverseStringWithPereservedSpaceing {

    public static void main(String[] args) {
        String str = "Sandeep singh java developer";
        reverse11(str);


        String[] strArray = str.split(" ");
        String newStr = "";
        for (String st : strArray) {
            char[] ch = st.toCharArray();
            int left = 0;
            int right = ch.length - 1;
            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
            newStr += Arrays.toString(ch) + " ";

        }
        //System.out.println(new String(newStr.replace(",", "")).trim());
    }

    private static void reverse11(String str) {
        String[] arr = str.split(" ");
        int n = 0;
        for (String st : arr) {
            n++;
            for (int i = st.length() - 1; i >= 0; i--) {
                System.out.print(st.charAt(i));
            }
            if (n!=n-1) {
                System.out.print(" ");
            }
        }
    }
}
