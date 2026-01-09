package ArraysQuestons;

import java.util.Stack;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4};
        int size = removeDuplicate(arr);
        System.out.println(size);
        int size2 = removeDuplicateByStack(arr);
        System.out.println(size2);
    }

    private static int removeDuplicateByStack(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        if(arr.length == 0){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!stack.isEmpty()){
                if(stack.peek() == arr[i]){
                    continue;
                }else {
                    stack.push(arr[i]);
                }
            }else {
                stack.push(arr[i]);
            }

        }
        return stack.size();
    }

    private static int removeDuplicate(int[] arr) {
        if(arr.length == 0){
            return 0;
        }

        int i =0;
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;

    }
}
