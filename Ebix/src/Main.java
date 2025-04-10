import demo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(18);
        list.add(10);
        int arr[] = {11, 12, 18, 5, 2}; // target = 6

       /* int  left = 0;
        int right=arr.length-1;
        int midIndex = (left +right)/2;
        int midele = arr[midIndex];
        if(midele<)
        min = ()*/
        selctionSort(arr);


    }

    private static void selctionSort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}