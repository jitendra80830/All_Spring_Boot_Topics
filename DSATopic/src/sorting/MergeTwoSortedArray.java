package sorting;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 5, 6};
        mergeTwoSortedArray(num1, num2);
    }

    private static void mergeTwoSortedArray(int[] num1, int[] num2) {
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
        for (int p = 0; p < ans.length; p++) {
            System.out.print(ans[p] + " ");
        }
    }
}
