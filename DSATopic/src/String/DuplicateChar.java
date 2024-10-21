package String;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        duplicateChar(st);
    }

    private static void duplicateChar(String st) {
        HashMap<Character ,Integer> hashMap = new HashMap<>();
        char ch[] = st.toCharArray();
        for (char c :ch){
            hashMap.put(c , hashMap.getOrDefault(c ,0)+1);
        }
        for (char c : hashMap.keySet()){
            if(hashMap.get(c)>=2){
                System.out.println(c+ " : "+hashMap.get(c));
            }
        }

    }
}
