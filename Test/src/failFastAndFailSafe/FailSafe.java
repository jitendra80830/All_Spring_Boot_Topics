package failFastAndFailSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			if(iterator.next() == "B") {
				list.add("M");
			}
		}
	}

}
