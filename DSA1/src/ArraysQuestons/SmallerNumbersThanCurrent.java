package ArraysQuestons;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int arr[] = {7,7,7,7};
        int ans []  = smallerNumbersThanCurrent(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] arr) {
        int ans[]  = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count= 0;
            int j = 0;
            for (; j < arr.length ; j++) {
                if(i!=j && arr[j] < arr[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
