package priorityQueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> arr =  Arrays.asList(33,22,2,2,2,11,22,21,1);
        for (int i = 0; i <arr.size() ; i++) {
            minHeap.add(arr.get(i));
        }
        for (int i = 0; i <minHeap.size() ; i++) {
            System.out.print(minHeap.remove()+" ");
        }
    }
}
