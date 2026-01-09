package ArraysQuestons;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        boolean cotains = containsDuplicate(arr);
        System.out.println(cotains);
    }

    private static boolean containsDuplicate(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.isEmpty() && set.contains(arr[i])){
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }
}
