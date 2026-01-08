package stringPack;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
       String s = "egg", t = "adh";
        boolean isomorphicStrings = isomorphicStrings(s, t);
        System.out.println(isomorphicStrings);
    }

    private static boolean isomorphicStrings(String s, String t) {
        Map<Character , Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.isEmpty() && map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!= t.charAt(i)){
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
