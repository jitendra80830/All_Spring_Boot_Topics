package String;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonCharFromStringArray {
    public static void main(String[] args) {
        String str[] = {"abcd","amnd","aghd"};
        findCommonCharFromStringArray(str);
    }

    private static void findCommonCharFromStringArray(String[] words) {
        int common[] = new int[26];

        Arrays.fill(common , Integer.MAX_VALUE);
        for (String word : words){
            //char[] ch = word.toCharArray();
            int[] count = new int[26];
            /*for (int i = 0; i <count.length ; i++) {
                count[count[i] - 'a']++;
            }*/
            for (char c : word.toCharArray()){
                count[c - 'a']++;
            }
            /*System.out.println("count");
            for (int c : count){
                System.out.print(c+" ");

            }
            System.out.println();
            System.out.println("====================");*/

            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(common[i] , count[i]);
            }
            /*System.out.println("Coomon");
            for (int c : common){
                System.out.print(c+" ");
            }
            System.out.println();*/
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j <common[i]; j++) {
                list.add((""+(char)('a'+i)));
            }
        }
        System.out.println(list);
    }
}
