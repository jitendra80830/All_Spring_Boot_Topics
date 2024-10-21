package String;

import java.util.HashMap;

public class IsomorficString {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        boolean ishomorphic = ishomorphic(s, t);
        System.out.println(ishomorphic);
    }

    private static boolean ishomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character , Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(!map.isEmpty() &&  map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }

            }else {
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i) , t.charAt(i));
            }

        }
        return true;
    }
}
