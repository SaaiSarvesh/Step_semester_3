package week_11.class_problems;

import java.util.Arrays;

public class PrizeTable {

    public static class PrizeResult {
        public int[] sortedMarks;
        public int totalSwaps;

        public PrizeResult(int[] sortedMarks, int totalSwaps) {
            this.sortedMarks = sortedMarks;
            this.totalSwaps = totalSwaps;
        }
    }

    public static PrizeResult prizeTable(int[] marks) {
        int n = marks.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swaps++;
            }
        }

        return new PrizeResult(marks, swaps);
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        int[] marks1 = {45, 90, 60, 75};
        PrizeResult res1 = prizeTable(marks1);
        System.out.println(Arrays.toString(res1.sortedMarks) + " swaps = " + res1.totalSwaps);

        System.out.println("\n--- Test Case 2 ---");
        int[] marks2 = {80, 70, 60};
        PrizeResult res2 = prizeTable(marks2);
        System.out.println(Arrays.toString(res2.sortedMarks) + " swaps = " + res2.totalSwaps);

        System.out.println("\n--- Custom Test Case ---");
        int[] marksCustom = {12, 98, 45, 63, 20};
        PrizeResult resCustom = prizeTable(marksCustom);
        System.out.println(Arrays.toString(resCustom.sortedMarks) + " swaps = " + resCustom.totalSwaps);
    }
}