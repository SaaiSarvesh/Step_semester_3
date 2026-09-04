package week_4.assigment_problems;
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubarray solution = new MaxSubarray();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Output 1: " + solution.maxSubArray(nums1));

        int[] nums2 = {-3, -1, -2};
        System.out.println("Output 2: " + solution.maxSubArray(nums2)); 
    }
}