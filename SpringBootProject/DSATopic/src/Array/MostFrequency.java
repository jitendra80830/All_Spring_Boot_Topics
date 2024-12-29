package Array;

import java.util.HashMap;

//Write a program to print the Most frequently occurring integer from the input array.
public class MostFrequency {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 2, 2, 2};
        int mostFrequency = mostFrequency(arr);
        System.out.println(mostFrequency);
    }

    private static int mostFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int val = 0;
        int key = 0;
        for (int k : map.keySet()) {
            if (val < map.get(k)) {
                val = map.get(k);
                key = k;
            }
        }
        return key;
    }
}
