public class ReplaceZeroToOne {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1},
                        {1,0,0},
                        {0,0,1}};
        arr[0][1] = 2;
        arr[1][1] = 2;
        arr[1][2] = 2;
        arr[2][0] = 2;
        arr[2][1] = 2;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
