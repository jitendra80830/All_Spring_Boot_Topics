package Array;
/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
        Return the array in the form [x1,y1,x2,y2,...,xn,yn]*/
public class Shuffle {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4,3,2,1};
        int n =4;
        int[] shuffle = shuffle(nums, n);
        for (int s = 0; s < shuffle.length; s++) {
            System.out.print(shuffle[s]+ " ");
        }
    }

    private static int[] shuffle(int[] nums , int n) {
        int ans[] = new int[2*n];
        int i = 0;
        int j =n;
        int k = 0;
        while (i<n){
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            i++;
            j++;
            k+=2;
        }
        return ans;
    }

}
