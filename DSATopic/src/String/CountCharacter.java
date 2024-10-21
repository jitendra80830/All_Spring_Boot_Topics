package String;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        countCharacter(str);
    }

    private static void countCharacter(String str) {
        HashMap<Character , Integer> hashMap = new HashMap<>();
        char ch[] = str.toCharArray();
        for (char c : ch){
            if(hashMap.containsKey(c)){
                hashMap.put(c , hashMap.get(c)+1);
            }else {
                hashMap.put(c ,1);
            }
        }
        System.out.println(hashMap);
    }

}
