import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortHashMapItsValues {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("D", 9);
        map.put("C", 11);
        map.put("B", 2);
        map.put("E", 0);

        LinkedHashMap<String, Integer> linkedHashMap = map.entrySet().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue())).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> v, LinkedHashMap::new)
        );
        System.out.println(linkedHashMap);
    }
}
