import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        /*int arr[] = {10, 11, 1, 13, 14, 15, 9, 17, 8, 19, 20};


        // System.out.println(arr[arr.length-2]);
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            max.add(arr[i]);
        }
        max.remove();
        System.out.println(max.peek());*/

        String[] arr = {"ajay", "kumar", "ajay", "kamlendra", "veer","kamlendra", "kumar", "kishan", "rahul"};
       // Frequency of each words
        Map<String , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }
        System.out.println(map);



    }
}
