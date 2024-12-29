package SearchingPack;

public class SortedLinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,4,6,8,9,11,33};
        int data = 22;
        int ele = sortedLinearSearch(arr , data);
        System.out.println(ele);
    }

    private static int sortedLinearSearch(int[] arr, int data) {

        for (int i = 0;i<arr.length;i++){
            if(arr[i]==data){
                return i;
            }
            if(arr[i]>data){
                return -1;
            }
        }
        return -1;


    }
}
