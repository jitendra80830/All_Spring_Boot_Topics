package Array;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int arr[] = {-100,-98,-1,2,3,4};
        int maximumProductOfThreeNumbers = maximumProductOfThreeNumbers(arr);
        System.out.println(maximumProductOfThreeNumbers);
    }

    private static int maximumProductOfThreeNumbers(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return Math.max(arr[n-1]*arr[n-2]*arr[n-3] ,arr[0]*arr[1]*arr[n-1]);
    }
}
