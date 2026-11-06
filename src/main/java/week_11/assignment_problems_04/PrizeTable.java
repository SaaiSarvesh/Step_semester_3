package week_11.assignment_problems_04;

public class PrizeTable {

    public static class Result {
        public int[] marks;
        public int swaps;

        public Result(int[] marks, int swaps) {
            this.marks = marks;
            this.swaps = swaps;
        }
    }

    public static Result prizeTable(int[] marks) {
        int n = marks.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIdx]) {
                    maxIdx = j;
                }
            }

            if (maxIdx != i) {
                int temp = marks[i];
                marks[i] = marks[maxIdx];
                marks[maxIdx] = temp;
                swaps++;
            }
        }
        return new Result(marks, swaps);
    }

    public static void main(String[] args) {
        int[] m1 = {45, 90, 60, 75};
        Result r1 = prizeTable(m1);
        printResult(r1);

        int[] m2 = {80, 70, 60};
        Result r2 = prizeTable(m2);
        printResult(r2);
    }

    private static void printResult(Result r) {
        System.out.print("[");
        for (int i = 0; i < r.marks.length; i++) {
            System.out.print(r.marks[i] + (i < r.marks.length - 1 ? ", " : ""));
        }
        System.out.println("] swaps = " + r.swaps);
    }
}