package week_11.assignment_problems_05;

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

            printArray(heights, pass);
            pass++;

            if (!swapped) {
                break;
            }
        }
    }

    private static void printArray(int[] arr, int pass) {
        System.out.print("Pass " + pass + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("--- Sample 1 ---");
        int[] h1 = {4, 2, 5, 1};
        lineUp(h1);

        System.out.println("\n--- Sample 2 ---");
        int[] h2 = {1, 3, 2, 4};
        lineUp(h2);
    }
}