package arrayPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersectionValues {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        findIntersectionValues(nums1, nums2);

    }

    private static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }
        List<Integer> list = new ArrayList<>();

        for (Integer val : s2) {
            if (s1.contains(val)) {
                list.add(val);
            }
        }
        System.out.println(list);
        return null;
    }
}
