package MathProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {2,7,4};
        int k = 181;
        List<Integer> integers = addToArrayForm(num, k);
        System.out.println(integers);
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;
        int cary = 0;
        List<Integer> ans = new ArrayList<>();
        while (i >= 0 || cary != 0) {
            int sun;
            int number = i >= 0 ? num[i] : 0;
            sun = (number + k) + cary;
            k = 0;
            ans.add(sun % 10);
            cary = sun / 10;
            i--;
        }
        Collections.reverse(ans);
        return ans;


    }
}
