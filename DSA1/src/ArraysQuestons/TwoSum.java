package ArraysQuestons;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]*/
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(arr , target);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");

        }
    }

    private static int[] twoSum(int[] arr, int target) {

        int[] ans = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

}
