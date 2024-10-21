package Maths;

public class ContainsOnlyODDNumbers {
    public static void main(String[] args) {
        int arr[] = {3, 7, 5, 9, 15, 25, 27};
        boolean onlyODDNumbers = containsOnlyODDNumbers(arr);
        System.out.println(onlyODDNumbers); // true
    }

    private static boolean containsOnlyODDNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        if (count == arr.length) {
            return true;
        } else {
            return false;
        }
    }
}
