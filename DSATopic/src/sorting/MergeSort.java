package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 7, 6};
        int[] sort = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }

    }

    public static int[] mergeSort(int[] arr, int start, int end) {

        if (start == end) {
            int[] ans = new int[1];
            ans[0] = arr[start];
            return ans;
        }

        int mid = start + (end - start) / 2;
        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid + 1, end);

        return mergeTwoSortedArray(left, right);
    }

    private static int[] mergeTwoSortedArray(int[] num1, int[] num2) {
        int[] ans = new int[num2.length + num1.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                ans[k] = num1[i];
                i++;
                k++;
            } else {
                ans[k] = num2[j];
                j++;
                k++;
            }
        }
        while (i < num1.length) {
            ans[k] = num1[i];
            k++;
            i++;
        }
        while (j < num2.length) {
            ans[k] = num2[j];
            k++;
            j++;
        }
        return ans;
    }
}
