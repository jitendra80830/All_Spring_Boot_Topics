package Array;

/*Given the array of integers nums, you will choose two different indices i and j of that array.
        Return the maximum value of (nums[i]-1)*(nums[j]-1).*/
public class MaxProduct {

    public static void main(String[] args) {
        int num[] = {3,7};
        int maxProduct = maxProduct(num);
        System.out.println(maxProduct);
    }

    private static int maxProduct(int[] num) {

        int max = 0;
        for (int i = 0; i < num.length - 1; i++) {
            int max2 = 0;
            for (int j = i + 1; j < num.length; j++) {
                max2 = (num[i] - 1) * (num[j] - 1);
                max = Math.max(max2, max);
            }
        }
        return max;
    }
}
