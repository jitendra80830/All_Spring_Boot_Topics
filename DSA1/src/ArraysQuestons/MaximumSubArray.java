package ArraysQuestons;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = {3,-4,2,6,5};
        int maxSum = maximumSubArray(arr);
        System.out.println(maxSum);
    }

    private static int maximumSubArray(int[] arr) {
        int maxSum = 0;
        for(int start = 0;start<arr.length;start++){
            int cSum = 0;
            for(int end = start;end<arr.length;end++){
                cSum+=arr[end];
            }
            maxSum = Math.max(maxSum , cSum);
        }


        return maxSum;
    }
}
