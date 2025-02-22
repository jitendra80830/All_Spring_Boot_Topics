package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortREverseOrder {
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(11.2, 33.1, 22.3, 11.1, 98.6, 3.1);
		sortReverseOrder(list);
	}

	private static void sortReverseOrder(List<Double> list) {
		list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));

	}

}
