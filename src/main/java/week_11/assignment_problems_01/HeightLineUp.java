package week_11.assignment_problems_01;

import java.util.Arrays;

public class HeightLineUp {

    public static void lineUp(int[] heights) {
        int n = heights.length;
        boolean swapped;
        int pass = 1;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            pass++;

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        int[] heights1 = {4, 2, 5, 1};
        lineUp(heights1);

        System.out.println("\n--- Test Case 2 ---");
        int[] heights2 = {1, 3, 2, 4};
        lineUp(heights2);

        System.out.println("\n--- Custom Test Case ---");
        int[] heightsCustom = {9, 3, 7, 1, 5};
        lineUp(heightsCustom);
    }
}