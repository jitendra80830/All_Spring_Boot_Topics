public class Main {
    public static void main(String[] args) {

        int arr[] = {1,2,4,5,6};
        missing(arr);


    }

    private static void missing(int[] arr) {
        int sum = 0;
        int n = arr.length+1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int num = n*(n+1)/2;

        System.out.println(num-sum);
    }
}