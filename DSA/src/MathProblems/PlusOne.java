package MathProblems;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] ints = plusOne(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+ " ");
        }
    }

    private static int[] plusOne(int[] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newArray = new int[arr.length+1];
        newArray[0] = 1;
        return newArray;
    }
}
