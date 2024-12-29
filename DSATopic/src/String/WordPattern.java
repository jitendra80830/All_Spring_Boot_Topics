package String;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String word = "dog cat cat fish";
        boolean wordPattern = wordPattern(pattern, word);
        System.out.println(wordPattern);
    }

    private static boolean wordPattern(String pattern, String word) {
        String[] s = word.split(" ");
        if(pattern.length()!=s.length){
            return false;
        }
        HashMap<Character  , String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if(!map.isEmpty() && map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(s[i])){
                    return false;
                }
            }else {
                if(map.containsValue(s[i])){
                    return false;
                }
                map.put(pattern.charAt(i) , s[i]);
            }

        }
        return true;

    }
}
