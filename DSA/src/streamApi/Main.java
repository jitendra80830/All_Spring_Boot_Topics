package streamApi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jitendra", "Test", "Manish");

        list.forEach(name -> {
            if (name.startsWith("T")) return;
            System.out.println(name);
        });

        Map<String, Map<String, String>> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("Bihar", "Gaya");
        map1.put("UP", "Noida");
        map1.put("Delhi", "rohani");


        Map<String, String> map2 = new HashMap<>();
        map2.put("Canada", "Torento");
        map2.put("sdsas", "gggdf");
        map2.put("dfgdfg", "ooojkjkkj");


        map.put("India", map1);
        map.put("US", map2);


        Set<String> key = map.keySet();
        Set<String> strings = map.keySet();
        for (String k : map.keySet()) {
            if (k.equals("India")) {
                Set<String> strings1 = map.get(k).keySet();
                System.out.println(strings1);
                break;
            }
        }


    }
}
