package arrayPack;

import java.util.Collections;
import java.util.PriorityQueue;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 33, 111, 1, 888, 22, 99, 112, 3, 200};
        int nth = 2;
        int largestNumber = secondLargestNumber(arr, nth);
        System.out.println(largestNumber);
    }

    private static int secondLargestNumber(int[] arr , int nth) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            max.add(arr[i]);
        }

        for (int i = 1; i <nth ; i++) {
            max.remove();
        }
        //System.out.println(max.poll());


        return max.peek();
    }
}
