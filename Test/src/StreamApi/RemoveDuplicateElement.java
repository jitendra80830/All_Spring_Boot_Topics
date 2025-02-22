package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","python","c","c#","Java","c#","c");
		//String str
		removeDuplicate(list);
	}

	private static void removeDuplicate(List<String> list) {
		//way1
		Set<String> collect = list.stream().collect(Collectors.toSet());
		collect.forEach(n -> System.out.println(n));
		
		List<String> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		
		
		
	}

}
