package SearchingPack;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 8, 9};
        int data = 11;
        /*int ele = binarySerach(arr, data);
        System.out.println(ele);*/
    }

    public int binarySerach(int[] arr, int data) {

        int low = 0;
        int high = arr.length - 1;
        //int mid = (0 + arr.length - 1) / 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data) {
                return mid;
            }
            if (arr[mid] > data) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return -1;
    }
}
