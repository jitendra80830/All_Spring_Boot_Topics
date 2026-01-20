package HashMapPack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByItsValues {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('c', 2);
        map.put('r', 0);
        map.put('g', 5);
        map.put('w', 1);
        map.put('o', 9);
        LinkedHashMap<Character, Integer> ans = sortMapByItsValues(map);
        System.out.println(ans);
        // System.out.println(ans);

    }

    private static LinkedHashMap<Character, Integer> sortMapByItsValues(HashMap<Character, Integer> map) {

        LinkedHashMap<Character, Integer> linkedHashMap = null;
         linkedHashMap = map.entrySet().stream().sorted((a, b) -> Integer.compare(a.getValue(), b.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));


        return linkedHashMap;
    }
}
