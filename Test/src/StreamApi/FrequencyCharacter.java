package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacter {
	public static void main(String[] args) {
		String str = "My name is jitendra kumar";
		List<String> list = Arrays.asList("Java","C","python0","Java","Python","C","C#","ReactJs");
		frequencyCharacter(str);
		frequencyElementFromArray(list);
	}

	private static void frequencyElementFromArray(List<String> list) {
		
		Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println(map);
;		
	}

	private static void frequencyCharacter(String str) {
		Map<Character,Long> countChar = str.chars().mapToObj(ch -> (char)ch ).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println(countChar);
		
	}

}
