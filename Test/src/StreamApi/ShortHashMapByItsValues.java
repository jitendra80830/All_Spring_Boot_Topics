package StreamApi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortHashMapByItsValues {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 3);
		map.put("D", 9);
		map.put("C", 11);
		map.put("B", 2);
		map.put("E", 0); 

		sortHashMapItsValues(map);
	}

	private static void sortHashMapItsValues(Map<String, Integer> map) {
		//ways1
		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		//ways2
		LinkedHashMap<String, Integer> sortedMap2 = map.entrySet().stream()
				.sorted((a, b) -> a.getValue().compareTo(b.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> v, LinkedHashMap::new));
		
		sortedMap.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println(sortedMap2);
	}

}
