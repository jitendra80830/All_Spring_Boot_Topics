package Array;

import java.util.HashMap;

public class MejorityEle {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        mejorityEle(arr);
    }

    private static int mejorityEle(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int mej = 0;
        for (int ele : map.keySet()) {
            if (map.get(ele) > arr.length) {
                mej = ele;
            }

        }
        return mej;
    }
}
