package hashMap;

import java.util.*;

public class SortItsByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Mango", 20);
        map.put("Banana", 40);
        map.put("Orange", 10);


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list , Map.Entry.comparingByValue());
        System.out.println(list);

        for (Map.Entry<String , Integer> data : list){
            System.out.println(data.getKey()+" : "+data.getValue());
        }
    }
}
