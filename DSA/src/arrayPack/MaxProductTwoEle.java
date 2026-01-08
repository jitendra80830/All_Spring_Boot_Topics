package arrayPack;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxProductTwoEle {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 2};

        int maxProductTwoEle = maxProductTwoEle(arr);
        System.out.println(maxProductTwoEle);
    }

    private static int maxProductTwoEle(int[] arr) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            max.add(arr[i]);
        }
        int a = max.poll()-1;
        int b = max.poll()-1;
        return a * b;
    }
}
