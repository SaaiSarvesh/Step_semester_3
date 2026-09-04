package week_4.assigment_problems;

import java.util.Scanner;

public class FindMinRotatedArray {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindMinRotatedArray solution = new FindMinRotatedArray();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements separated by spaces:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int minElement = solution.findMin(nums);
        System.out.println("Minimum element: " + minElement);

        scanner.close();
    }
}