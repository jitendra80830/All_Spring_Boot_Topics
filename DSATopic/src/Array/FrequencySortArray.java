package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrequencySortArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3};
        int[] frequencySortArray = frequencySortArray(arr);
        for (int i = 0; i < frequencySortArray.length; i++) {
            System.out.print(frequencySortArray[i]+ " ");
        }
    }

    private static int[] frequencySortArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Integer>[] list = new ArrayList[arr.length + 1];
        for (Integer k : map.keySet()) {
            if (list[map.get(k)] == null) {
                list[map.get(k)] = new ArrayList<>();
            }
            list[map.get(k)].add(k);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < list.length; i++) {
            if(list[i]!=null){
                for (Integer val : list[i]){
                    for (int j = 0; j < i; j++) {
                        arrayList.add(val);
                    }
                }
            }
        }
        int ans[] = new int[arrayList.size()];
        int i = 0;
        for (Integer k : arrayList){
            ans[i] = k;
            i++;
        }
        return ans ;
    }
}
