package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoUunsortedArraysIntoSingleSortedArray {
	public static void main(String[] args) {
		int[] a = {3,1,33,89,1};
		int[] b = {8,2,9,4,1,3,2};
		
		
		mergeTwoUunsortedArraysIntoSingleSortedArray(a ,b);
		
	}

	private static void mergeTwoUunsortedArraysIntoSingleSortedArray(int[] a, int[] b) {
		
		int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		
		Arrays.stream(array).forEach(n -> System.out.print(n+ " "));
	}

}
