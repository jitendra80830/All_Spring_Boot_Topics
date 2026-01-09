package ArraysQuestons;

import static ArraysQuestons.CountNumber.countArrayData;

public class CountNumber {
    public static void main(String[] args) {
        int arr[] = {3,3,4,5,6,6,2,2,2,8,2,9,1,7,1};
        countArrayData(arr);
    }
    public static void countArrayData(int arr[]){
        int freq[] = new int[16];

        for (int i = 0; i <arr.length ; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i <16 ; i++) {
            if(freq[i]!=0){
                System.out.println(i+" : "+freq[i]);
            }
        }
    }
}
