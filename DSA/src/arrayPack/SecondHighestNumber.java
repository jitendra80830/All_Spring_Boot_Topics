package arrayPack;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 10, 15, 25, 35, 53, 9};
        int i = secondGHighest(arr);
        System.out.println(i);
    }

    private static int secondGHighest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
