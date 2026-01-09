package HashMapPack;

import java.util.HashMap;

public class SortHashMapByItsValues {
    public static void main(String[] args) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('c' , 2);
        map.put('r' , 0);
        map.put('g' , 5);
        map.put('w' , 1);
        map.put('o',9);
        HashMap<Character, Integer> ans = sortMapByItsValues(map);
       // System.out.println(ans);

    }

    private static HashMap<Character, Integer> sortMapByItsValues(HashMap<Character, Integer> map) {

        char[] count = new char[10];
        HashMap<Character , Integer> newHashmap = new HashMap<>();
  
        return newHashmap;
    }
}
