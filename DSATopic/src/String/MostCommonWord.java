package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        String mostCommonWord = mostCommonWord(paragraph, banned);
        System.out.println(mostCommonWord);
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();

        String replace = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
        //char[] chars = replace.toCharArray();
        String[] paragraphWord = replace.split("\\s+"); // split on basice non white space character
        for (int i = 0; i < paragraphWord.length; i++) {
            String sk = paragraphWord[i].toLowerCase();
            map.put(sk, map.getOrDefault(sk, 0) + 1);
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        int maxOcc = 0;
        String maxOccWord = "";
        for (String k : map.keySet()) {
            int minOcc = 0;
            if (!set.contains(k) && map.containsKey(k)) {
                minOcc = map.get(k);
                if (minOcc > maxOcc) {
                    maxOcc = minOcc;
                    maxOccWord = k;
                }

            }
        }

        return maxOccWord;


    }
}
