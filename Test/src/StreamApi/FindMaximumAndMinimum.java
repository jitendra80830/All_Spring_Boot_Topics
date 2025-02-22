package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumAndMinimum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,433,7,9,10,22,12,34,5,6,77);
		findMaximumAndMinimum(list);
		
	}

	private static void findMaximumAndMinimum(List<Integer> list) {
		Integer max = list.stream().max(Comparator.naturalOrder()).get();	
		System.out.println(max);
		
		Integer min = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
		
	}

}
