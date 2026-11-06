package week_11.class_problems;

import java.util.HashSet;
import java.util.Set;

public class PairSumUnsorted {

    public static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 4, 6};

        System.out.println("nums1 has pair for target 9: " + hasPairWithSum(nums1, 9));
        System.out.println("nums2 has pair for target 20: " + hasPairWithSum(nums2, 20));
    }
}