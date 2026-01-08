package streamApi;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        int missingNum = missingNum(arr);
        System.out.println(missingNum);
    }

    private static int missingNum(int[] arr) {
        int n = arr.length + 1;

        int expected = n * (n + 1) / 2;
        int actual = Arrays.stream(arr).sum();
        return expected - actual;

    }
}
