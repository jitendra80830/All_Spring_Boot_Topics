package SearchingPack;

public class UnsortedLinearSearch {

    public static void main(String[] args) {
        int arr[] = {2, 11, 4, 9, 5, 3, 22, 19};
        int element = 55;
        int data = unsortedLinearSort(arr, element);
        System.out.println(data);
    }

    public static int unsortedLinearSort(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
