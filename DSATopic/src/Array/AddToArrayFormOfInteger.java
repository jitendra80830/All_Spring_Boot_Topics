package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int arr[] = {9,9,9};
        int k = 19;
        List<Integer> addToArrayFormOfInteger1 =  addToArrayFormOfInteger(arr , k);
        Collections.reverse(addToArrayFormOfInteger1);
        System.out.println(addToArrayFormOfInteger1);
    }

    private static List<Integer> addToArrayFormOfInteger(int[] num, int k) {
        int i = num.length-1;
        List<Integer> list = new ArrayList<>();
        int cary = 0;
        while(i >=0 || cary!=0){
            int sum = 0;
            int digit = i>=0?num[i]:0;
            sum = (digit + k) + cary;
            k = 0;
            list.add(sum%10);
            cary = sum/10;
            i--;
        }
        return list;
    }
}
