package ArraysQuestons;

public class RunningSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int ans[] = runningSum(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] runningSum(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            ans[i]= sum+=arr[i];
        }
        return ans;
    }
}
