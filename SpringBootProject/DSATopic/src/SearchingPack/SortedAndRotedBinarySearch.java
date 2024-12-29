package SearchingPack;

public class SortedAndRotedBinarySearch {

    public static void main(String[] args) {
        int arr[] = {60, 70, 80, 90, 20, 30, 40, 50};
        int pivotEle = findPivotEle(arr, 0, arr.length - 1);
    }

    private static int findPivotEle(int[] arr, int start, int end) {

        if (end < start) return -1;
        int mid = start + (end - start) / 2;

        if (arr[mid] > arr[mid + 1]) {
            return mid + 1;
        }
        if (arr[mid - 1] > arr[mid]) {
            return mid;
        }

        if (arr[mid] < arr[start]) {
            findPivotEle(arr, start, mid - 1);
        }
        return findPivotEle(arr, mid + 1, end);
    }

    public int findkey(int arr[], int n, int key) {

        BinarySearch b = new BinarySearch();
        int pivot = findPivotEle(arr, 0, n - 1);
        if (pivot == -1) {
            b.binarySerach(arr, key);
        }
        if (arr[pivot] == key) {
            return pivot;
        }
        return 0;

    }
}
