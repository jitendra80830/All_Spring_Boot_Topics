package Array;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,-1,0};
        int k = 0;
        System.out.println(subarraySumEqualsK(nums , k));
    }

    private static int subarraySumEqualsK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if(sum == k){
                    count++;
                }

            }
        }


        return count;

    }
}
