package Array;

public class RemoveEle {
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int val = 3;
        int i = removeDup(arr, val);
        System.out.println(i);
    }

    private static int removeDup(int[] arr, int val) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=val){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}
