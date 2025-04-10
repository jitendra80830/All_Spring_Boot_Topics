package sorting;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 1};
        selectionSortAlgo(arr);
    }

    private static void selectionSortAlgo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
