package ArraysQuestons;

/*Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
        Example 1:
        Input: nums = [3,1,2,2,2,1,3], k = 2
        Output: 4*/
public class CountPairs {
    public static void main(String[] args) {
        int arr[] = {3,1,2,2,2,1,3};
        int k = 2;
        int pairs = countPairs(arr , k);
        System.out.println(pairs);
    }

    private static int countPairs(int[] arr, int k) {

        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    if((i*j)%2==0){
                      count++;
                    }
                }
            }
        }
        return count;
    }
}
