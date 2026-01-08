package StreamApi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortbyvaluesMap2 {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();

        map.put("jitendra",22);
        map.put("ram",2);
        map.put("kumar",11);
        map.put("ramesh",0);
        map.put("pawan",30);
        map.put("ranjan",100);

        LinkedHashMap<String, Integer> linkedHashMap = map.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue())).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));


        System.out.println(linkedHashMap);
    }
}
