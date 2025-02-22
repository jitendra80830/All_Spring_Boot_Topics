package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddAndEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,7,9,11,66,11,30);
		printOddNumber(list);
		printEvenNumber(list);
	}

	private static void printEvenNumber(List<Integer> list) {
		System.out.println("Even Number");
		list.stream().filter(n -> n%2==0).collect(Collectors.toList()).forEach(n -> System.out.print(n+ " "));
		
	}

	private static void printOddNumber(List<Integer> list) {
		List<Integer> odd = list.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		System.out.println("Odd Numbers");
		odd.forEach(n -> System.out.print(n+" "));
		System.out.println();	
	}

}
