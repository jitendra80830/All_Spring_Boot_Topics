public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1},
                {1, 0, 0},
                {0, 0, 1}};

        replaceZero(arr);
    }

    private static void replaceZero(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("After replace 0 to 2");


        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
