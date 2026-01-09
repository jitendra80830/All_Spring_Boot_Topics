package ArraysQuestons;

/*
Given an integer array nums and an integer k,
return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
Input: nums = [1,2,2,1], k = 1
Output: 4
*/
public class CountKDifference {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,4};
        int k = 2;
        int an = countKDifference(arr,k);
        System.out.println(an);
    }

    private static int countKDifference(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (Math.abs(arr[i] - arr[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
}
