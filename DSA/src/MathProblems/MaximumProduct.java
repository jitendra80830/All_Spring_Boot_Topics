package MathProblems;

import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int maximumProduct = maximumProduct(arr);
        System.out.println(maximumProduct);
    }

    private static int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = Math.max(arr[n-1]*arr[n-2]*arr[n-3] , arr[0]*arr[1]*arr[n-1]);
        return ans;
    }
}
