package Array;

import java.util.Arrays;

public class KDiffPairInAnArray {
    public static void main(String[] args) {
        int[] arr =  {1,3,1,5,4};
        int target = 0;
        kDiffPairInAnArray(arr , target);
    }

    private static void kDiffPairInAnArray(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int cout = 0;
        while (i <arr.length && j< arr.length){
            if(Math.abs(arr[i] -arr[j]) == target){
                System.out.println(i+" "+j);
                return;
            }
            else if(Math.abs(arr[i] -arr[j]) > target){
                i++;
            }
            else if(Math.abs(arr[i] -arr[j]) < target){
                j++;
            }
        }
        System.out.println("-1");;
    }
}
