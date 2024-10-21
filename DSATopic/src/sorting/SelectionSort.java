package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {23, 10, 4, 5, 11, 2, 7};
        int sortedArray[] = selectionSort(arr);
        for (int i=0; i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }

    }

    private static int[] selectionSort(int[] arr) {

        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
