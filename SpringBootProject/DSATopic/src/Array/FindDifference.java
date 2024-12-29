package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
        answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
        answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
        Note that the integers in the lists may be returned in any order.*/
public class FindDifference {
    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};
        List<List<Integer>> difference = findDifference(nums1, nums2);
        for (int i = 0; i < difference.size(); i++) {
            System.out.println(difference.get(i));
        }
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> finalList =new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }
        for (Integer ss1 : s1) {
            if (!s2.contains(ss1)) {
                ans1.add(ss1);
            }
        }
        for (Integer ss2 : s2){
            if(!s1.contains(ss2)){
                ans2.add(ss2);
            }
        }
        finalList.add(0 ,ans1);
        finalList.add(1 ,ans2);
        return finalList;
    }
}
