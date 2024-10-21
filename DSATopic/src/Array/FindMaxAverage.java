package Array;

public class FindMaxAverage {
    public static void main(String[] args) {
        int arr[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double maxAverage = findMaxAverage(arr, k);
        System.out.println(maxAverage);
    }

    private static double findMaxAverage(int[] arr, int k) {
/*        if (k == 1) {
            return arr[0] * 1.0;
        }*/
        int sum = 0;
        double avg = 0.0;
        double ans = 0.0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        avg = sum * 1.0 / k;
        ans = avg;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            avg = sum * 1.0 / k;
            ans = Math.max(ans, avg);

        }
        return ans;
    }
}
