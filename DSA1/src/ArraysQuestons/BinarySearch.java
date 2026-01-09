package ArraysQuestons;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,8,9};
        int target = 11;
        System.out.println(binarySearch(arr ,target));
    }

    private static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid -1;
            }else {
                start  = mid+1;
            }
        }
        return -1;
    }
}
