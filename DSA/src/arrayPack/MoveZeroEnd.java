package arrayPack;

public class MoveZeroEnd {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        movezerosEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void movezerosEnd(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr[j] == 0) {
                ++j;
            } else {
                swap(i, j, arr);
                ++i;
                ++j;
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
