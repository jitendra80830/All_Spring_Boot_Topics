package Array;
/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.
You can return the answer in any order.*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int ans [] = twoSum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    private static int[] twoSum(int[] arr, int target) {
        int ans[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.isEmpty() && map.containsKey(target - arr[i])) {
                ans[0] = map.get(target - arr[i]);
                ans[1] = i;
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }
}
