package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AddPrefixPostfixAndDelimeterToList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","C","python0","Java","Python","C","C#","ReactJs");
		addPrefixPostfixAndDelimeterToList(list);
	}

	private static void addPrefixPostfixAndDelimeterToList(List<String> list) {
		String string = list.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(string);
		
	}

}
