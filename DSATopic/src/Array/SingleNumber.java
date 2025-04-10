package Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 4};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }

    private static int singleNumber(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //System.out.println(map);

        for (int k  : map.keySet()){
            if(map.get(k)==1){
                return k;
            }
        }
        return -1;
    }
}
