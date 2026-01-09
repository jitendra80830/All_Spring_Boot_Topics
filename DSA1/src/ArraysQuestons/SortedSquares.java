package ArraysQuestons;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        sortedSquares(arr);
    }

    private static int[] sortedSquares(int[] arr) {
        int ans[] = new int[arr.length];
        int sqr = 1;
        for (int i = 0; i < arr.length; i++) {
            ans[i] = Math.abs(arr[i] * arr[i]);
        }
        Arrays.sort(ans);
        return ans;
    }
}
