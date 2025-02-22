package failFastAndFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<>();
		map.put("jitendra", "JavaDev");
		map.put("ram", "JavaDev");
		map.put("A", "JavaDev");
		map.put("B", "JavaDev");
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			map.put("D", "It");
			
		}
	}

}
