package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SmallestNumberFromArray {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 8,1};
        int i = smallestNumberFromArray(arr);
        System.out.println(i);
        int numberFromArray2 = smallestNumberFromArray2(arr);
        System.out.println(numberFromArray2);
    }

    private static int smallestNumberFromArray2(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    private static int smallestNumberFromArray(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        return pq.remove();
    }
}
