package Array;

public class PlusOne {
    public static void main(String[] args) {
        int digit[] = {9};
        int[] ints = plusDigit(digit);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        //System.out.println(ints);
    }

    private static int[] plusDigit(int[] digit) {
        int n = digit.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digit[i] < 9) {
                digit[i]++;
                return digit;
            }
            digit[i] = 0;

        }
        int newArray[] = new int[n + 1];
        newArray[0] = 1;
        return newArray;
    }
}
