package ArraysQuestons;

import java.util.Collections;
import java.util.PriorityQueue;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int arr[] = {4,3,1,5};
        int ans = thirdMax(arr);
        System.out.println(ans);
    }

    private static int thirdMax(int[] arr) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }
        for (int i = 0; i < 2; i++) {
            maxHeap.remove();
        }
        return maxHeap.peek();

    }
}
