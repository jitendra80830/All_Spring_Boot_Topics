package ArraysQuestons;

public class NextGreaterElement {
    public static void main(String[] args) {
        int num1[] = {4,1,2};
        int num2[] = {1,3,4,2};

        int ans[] = nextGreaterElement(num1 , num2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    private static int[] nextGreaterElement(int[] num1, int[] num2) {
        int ana[] = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            int flag = 0;
            for (int j = 0; j <num2.length; j++) {
                if(num2[j] == num1[i]){
                   // if(num2[j])
                    ana[i] = num2[j];
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                ana[i] = -1;
            }
        }
        return ana;
    }
}
