package sorting;

import static sorting.BubbleSort.bubbleSort;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = 1;
                }
            }
            if(swap==0){
                break;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
