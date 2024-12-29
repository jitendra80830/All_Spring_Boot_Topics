package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {811, 2, 4, 11, 6, 1, 22, 1};

        int[] sortedArray = bubbleSort(arr, arr.length);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }


    public static int[] bubbleSort(int[] arr, int length) {

        for (int j = 0; j < length; j++) {
            int swapped = 0;
            for (int i = 0; i < length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int small = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = small;
                    swapped = 1;
                }
            }
            if(swapped ==0){
                break;
            }
        }
        return arr;

    }
}
