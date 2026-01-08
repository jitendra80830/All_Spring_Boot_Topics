public class SingleLoop {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        singleLoop(arr);
    }

    private static void singleLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(arr[i]==1 || arr[i]==3 || arr[i]==6 ){
                System.out.println();
            }

        }
    }
}
