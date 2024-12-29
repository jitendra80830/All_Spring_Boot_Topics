package Array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int num1[] = {4, 1, 2};
        int num2[] = {1, 3, 4, 2};
        int[] ints = nextGreaterElement(num1, num2);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    private static int[] nextGreaterElement(int[] num1, int[] num2) {

        int[] ans = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[num2.length - 1]) {
                    ans[i] = -1;
                } else {
                    if (num1[i] == num2[j]) {
                        int k = j;
                        for (int l = k + 1; l < num2.length; l++) {
                            if (num2[l] > num1[i]) {
                                ans[i] = num2[l];
                                break;
                            } else {
                                ans[i] = -1;
                                break;
                            }

                        }
                    }
                }
            }

        }
        return ans;
    }
}
