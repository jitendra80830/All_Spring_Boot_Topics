package Array;

public class MoveZeroesAtLast {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }

    private static void moveZeroes(int[] arr) {
        if(arr.length ==1 || arr.length == 0){
            return;
        }

        int i  = 0;
        int j = 0;
        for (;j<arr.length ;){
            if(arr[j]==0){
                ++j;
            }else {
                swap(arr , i ,j);
                ++i;
                ++j;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a]+" ");;
        }
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
