package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int arr[] = {1, 1, 0, 1, 1, 1,0,0,0,0};
        int i = maxConsecutiveOnes(arr);
        System.out.println(i);
    }

    private static int maxConsecutiveOnes(int[] arr) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
