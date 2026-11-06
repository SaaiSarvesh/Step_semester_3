package week_11.assignment_problems_02;

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

            System.out.print("Pass " + pass + ": [");
            for (int k = 0; k < n; k++) {
                System.out.print(heights[k] + (k < n - 1 ? ", " : ""));
            }
            System.out.println("]");
            pass++;

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Test 1 ---");
        int[] h1 = {4, 2, 5, 1};
        lineUp(h1);

        System.out.println("\n--- Test 2 ---");
        int[] h2 = {1, 3, 2, 4};
        lineUp(h2);

        System.out.println("\n--- Custom Test ---");
        int[] h3 = {8, 3, 5, 1, 9};
        lineUp(h3);
    }
}