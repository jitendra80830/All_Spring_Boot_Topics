package Array;

public class MaximumSubarray {
    public static void main(String[] args) {
        int arr[] = {5, 4, -1, 7, 8};
        int maximumSubarray = maximumSubarray(arr);
        System.out.println(maximumSubarray);
    }

    private static int maximumSubarray(int[] arr) {
        int sum = 0;
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;

    }
}
