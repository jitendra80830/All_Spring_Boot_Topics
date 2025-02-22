package StreamApi;

import java.util.Arrays;
import java.util.List;

public class MultiplyOf5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,21,44,22,20,30,60,11,88,33,77);
		multiplyOf5(list);
	}

	private static void multiplyOf5(List<Integer> list) {
		list.stream().filter(n -> n%5==0).forEach(System.out::println);;
		
	}

}
