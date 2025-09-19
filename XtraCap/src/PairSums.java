import java.util.HashMap;
import java.util.Map;

public class PairSums {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = 0;
        boolean isPairs = sumPairs(arr, target);
        System.out.println(isPairs);
    }

    private static boolean sumPairs(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - target)) {
                int sum = arr[i] + (map.get(arr[i] - target));
                if (sum == target) {
                    return true;
                }
            } else {

                map.put(arr[i], i);
            }
        }
        //System.out.println(map);

        return false;

    }
}
