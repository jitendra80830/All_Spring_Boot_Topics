package String;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        boolean isomorphic = isIsomorphic(s, t);
        System.out.println(isomorphic);
    }

    private static boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> map = new HashMap<>();
        int flag = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(!map.isEmpty() && map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) == t.charAt(i)){
                    flag = 1;
                    break;
                }
            }else {
                map.put(s.charAt(i) , t.charAt(i));
            }

        }
        if(flag == 1){
            return true;
        }else {
            return false;
        }
    }
}
