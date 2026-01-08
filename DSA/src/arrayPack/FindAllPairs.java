package arrayPack;

import java.util.HashMap;
import java.util.Map;

public class FindAllPairs {
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 1, 3, 3, 3, 5, 2};
        int target = 7;
        findAllPairs(arr, target);
    }

    private static void findAllPairs(int[] arr, int target) {
        Map<Integer, Integer> ans = new HashMap<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                ans.put(arr[i], arr[map.get(target-arr[i])]);
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println(ans);

    }
}
