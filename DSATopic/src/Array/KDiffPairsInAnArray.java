package Array;

import java.util.HashMap;

public class KDiffPairsInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 1;
        int kDiffPairsInAnArray = kDiffPairsInAnArray(arr, target);
        System.out.println(kDiffPairsInAnArray);
    }

    private static int kDiffPairsInAnArray(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //System.out.println(map);
        int count = 0;
        for (int k : map.keySet()) {
            if(target == 0){
                if(map.get(k)>1){
                    count++;
                }
            }else {
                if (map.containsKey(k + target)) {
                    count++;
                }
            }
        }
        return count;
    }
}
