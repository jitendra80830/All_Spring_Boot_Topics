package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		// Find sum of all digits of a number in Java 8?
		int i = 12345;
		Integer integer = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(integer);

		// Find second largest number in an integer array?
		List<Integer> list = Arrays.asList(22, 11, 4, 12, 66, 88, 43, 99);
		Integer secondLargestNumber = list.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
		System.out.println(secondLargestNumber);

		// Given a list of strings, sort them according to increasing order of their
		// length?
		List<String> stringList = Arrays.asList("java", "python", "C#", "C++", "Html");
		stringList.stream().sorted(Comparator.comparing(String::length)).forEach(n -> System.out.println(n));

		// Given an integer array, find sum and average of all elements?
		int arr[] = new int[] { 3, 2, 1, 6, 8, 9 };
		OptionalDouble average = Arrays.stream(arr).average();
		System.out.println(average);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		
		// How do you find common elements between two arrays?
		
		List<Integer> asList = Arrays.asList(2,1,5,6,8,9,11);
		List<Integer> asList2 = Arrays.asList(3,2,1,5,12,44);
		asList.stream().filter(asList2::contains).forEach(n -> System.out.println(n));
	}

}
