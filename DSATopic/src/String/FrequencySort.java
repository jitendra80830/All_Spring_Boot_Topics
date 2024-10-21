package String;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        String s = "tree";
        String frequencySort = frequencySort(s);
        System.out.println(frequencySort);
    }

    private static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<Character>[] arr = new ArrayList[s.length() + 1];
        map.keySet().forEach(c -> {
            if (arr[map.get(c)] == null) {
                arr[map.get(c)] = new ArrayList<>();
            }
            arr[map.get(c)].add(c);
        });
        String ans = "";
        StringBuffer sb = new StringBuffer();

        for (int i = arr.length-1; i>=0 ; i--) {
            if(arr[i]!=null){
                for (Character c : arr[i]){
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
