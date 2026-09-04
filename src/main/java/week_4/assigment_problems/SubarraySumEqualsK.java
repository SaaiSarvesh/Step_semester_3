package week_4.assigment_problems;

import java.util.HashMap;
import java.util.Map;
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentPrefixSum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        for (int num : nums) {
            currentPrefixSum += num;
            if (prefixSumMap.containsKey(currentPrefixSum - k)) {
                count += prefixSumMap.get(currentPrefixSum - k);
            }
            prefixSumMap.put(currentPrefixSum, prefixSumMap.getOrDefault(currentPrefixSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Output 1: " + solution.subarraySum(nums1, k1)); // Expected: 2
        int[] nums2 = {1, -1, 0};
        int k2 = 0;
        System.out.println("Output 2: " + solution.subarraySum(nums2, k2)); // Expected: 3
    }
}