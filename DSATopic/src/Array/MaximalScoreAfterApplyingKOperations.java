package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {
    public static void main(String[] args) {
        int[] nums = {1,10,3,3,3};
        int k = 3;
        System.out.println(maximalScoreAfterApplyingKOperations(nums , k));

    }

    private static int maximalScoreAfterApplyingKOperations(int[] nums, int k) {
        int score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        while(k>0){
           int peekVal = pq.poll();
            score+= peekVal;
            pq.add((peekVal+2)/3);
            k--;
        }
        return score;
    }
}
