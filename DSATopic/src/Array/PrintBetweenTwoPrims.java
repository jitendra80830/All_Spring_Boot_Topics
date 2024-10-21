package Array;

public class PrintBetweenTwoPrims {
    public static void main(String[] args) {
        int left = 7;
        int right = 30;
        printBetweenTwoPrims(left, right);
    }

    private static void printBetweenTwoPrims(int left, int right) {

        for (int i = left; i < right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }

        }

    }
}
