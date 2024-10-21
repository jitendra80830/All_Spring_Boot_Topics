package Array;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[] = {0,2};
        int maximumProductSubarray = maximumProductSubarray(arr);
        System.out.println(maximumProductSubarray);
    }

    private static int maximumProductSubarray(int[] arr) {
        int product = 1;
        int maxProduct  = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
            maxProduct = Math.max(product , maxProduct);
            if(product < 0){
                product = 1;
            }
        }
        product = 1;
        for (int i = arr.length-1;i>=0;i--) {
            product*=arr[i];
            maxProduct = Math.max(product , maxProduct);
            if(product < 0){
                product = 1;
            }
        }
        return maxProduct;
    }
}
