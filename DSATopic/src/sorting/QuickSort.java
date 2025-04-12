package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 6, 1, 4};
       /* int pi = partition(arr, 0, arr.length - 1);
        System.out.println(pi);*/
        quickSort(arr , 0 , arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }

    public static void quickSort(int[] arr, int si, int end) {
        if (si > end) {
            return;
        }
        int pi = partition(arr, si, end);
        quickSort(arr, si, pi-1);
        quickSort(arr, pi + 1, end);
    }

    private static int partition(int[] arr, int si, int end) {
        int pivot = arr[arr.length - 1];
        int pi = si;
        for (int i = si; i < end; i++) {
            if (arr[i] < pivot) {
                int tem = arr[i];
                arr[i] = arr[pi];
                arr[pi] = tem;
                pi++;
            }
        }
        int temp = arr[pi];
        arr[pi] = arr[end];
        arr[end] = temp;
        return pi;
    }

}
