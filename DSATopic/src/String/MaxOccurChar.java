package String;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccurChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        maxOccurChar(str);
    }

    private static void maxOccurChar(String str) {
        HashMap<Character , Integer> hashMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch){
            hashMap.put(c , hashMap.getOrDefault(c ,0)+1);
        }
        System.out.println(hashMap);
        char ans =' ';
        int intAns =0;
        for (char c: hashMap.keySet()){
            //System.out.println(c);
            //Integer integer = hashMap.get(c);
            if(hashMap.containsKey(c)){
                //intAns = Math.max(hashMap.get(c) ,intAns);
                if(hashMap.get(c) > intAns){
                    intAns = hashMap.get(c);
                    ans = c;
                }
            }
        }
        System.out.println(ans+": "+intAns);
    }
}
