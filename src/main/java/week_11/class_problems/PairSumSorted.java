package week_11.class_problems;

public class PairSumSorted {

    public static String pairSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return "(" + nums[left] + ", " + nums[right] + ")";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 5, 9};
        int[] nums2 = {1, 2, 3};

        System.out.println("Pair for target 4: " + pairSumSorted(nums1, 4));
        System.out.println("Pair for target 100: " + pairSumSorted(nums2, 100));
    }
}