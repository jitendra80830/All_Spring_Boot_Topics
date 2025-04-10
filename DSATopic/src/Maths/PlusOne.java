package Maths;

public class PlusOne {
    public static void main(String[] args) {
        int arr[] = {1, 2, 9};
        int ans[] = onePlus(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    private static int[] onePlus(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;
                return arr;
            }
        }
        arr[arr.length - 1] = 0;

        int ans[] = new int[arr.length + 1];
        ans[0] = 1;
        return ans;
    }
}
