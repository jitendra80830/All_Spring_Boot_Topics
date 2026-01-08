package arrayPack;

public class MaximumSumOfK {
    public static void main(String[] args) {
        int[] arr = {5, 2, -1, 0, 3};
        int k = 3;
        maximumSum(arr, k);
    }

    private static void maximumSum(int[] arr, int k) {
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }
        int window_sum = max_sum;
        for (int i = k; i <arr.length ; i++) {
            window_sum+=arr[i] - arr[i-k];
            max_sum = Math.max(window_sum , max_sum);
        }
        System.out.println(max_sum);
    }
}
