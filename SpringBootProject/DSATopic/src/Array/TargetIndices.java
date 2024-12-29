package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
You are given a 0-indexed integer array nums and a target element target.
        A target index is an index i such that nums[i] == target.
        Return a list of the target indices of nums after sorting nums in non-decreasing order.
        If there are no target indices,
        return an empty list. The returned list must be sorted in increasing order.
*/
public class TargetIndices {

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 2, 3};
        int target = 2;
        List<Integer> list = targetIndices(arr, target);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }

    private static List<Integer> targetIndices(int[] arr , int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}
