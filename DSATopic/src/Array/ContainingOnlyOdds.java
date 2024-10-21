package Array;

public class ContainingOnlyOdds {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 18, 25};
        boolean containingOnlyOdds = containingOnlyOdds(arr);
        System.out.println(containingOnlyOdds);
    }

    private static boolean containingOnlyOdds(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            return false;
        } else {
            return true;
        }
    }
}
