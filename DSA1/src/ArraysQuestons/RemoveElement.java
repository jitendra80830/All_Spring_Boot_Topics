package ArraysQuestons;

/*
Given an integer array nums and an integer val,
remove all occurrences of val in nums in-place. The order of the elements may be changed.
Then return the number of elements in nums which are not equal to val.
*/
public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        int k = 2;
        int ans = removeElement(arr , k);
        System.out.println(ans);
    }

    private static int removeElement(int[] arr, int k) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=k){
                count++;
            }
        }
        return count;
    }
}
