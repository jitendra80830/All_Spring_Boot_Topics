package Array;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,};
        removeDuplicatesfromSortedArray(arr);
    }

    private static int removeDuplicatesfromSortedArray(int[] arr) {

        int  i = 0;
        for (int j = 1; j <arr.length ; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i +1;

    }
}
