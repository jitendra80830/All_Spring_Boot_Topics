package String;

import java.util.HashMap;

public class CountCommonsWords {
    public static void main(String[] args) {
        String[] word1 = {"leetcode", "amazing", "cool","cool"};
        String[] word2 = {"leetcode", "amazing", "cool","is","is"};
        int countCommonsWords = countCommonsWords(word1, word2);
        System.out.println(countCommonsWords);
    }

    private static int countCommonsWords(String[] word1, String[] word2) {
        HashMap<String , Integer> map1 = new HashMap<>();
        HashMap<String , Integer> map2 = new HashMap<>();
        int count = 0;

        for (int i = 0; i <word1.length ; i++) {
            map1.put(word1[i] , map1.getOrDefault(word1[i] ,0)+1);
        }
        for (int i = 0; i <word2.length ; i++) {
            map2.put(word2[i] , map2.getOrDefault(word2[i] , 0)+1);
        }

        System.out.println(map1);
        System.out.println(map2);

        for (String str : map1.keySet()){

            if(map2.containsKey(str)){
                if(map1.get(str) ==1 && map2.get(str)==1){
                    System.out.println(str);
                    count++;
                }
            }
        }

        return count;
    }
}
