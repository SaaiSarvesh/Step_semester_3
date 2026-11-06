package week_11.class_problems;

public class WarehouseGridScan {

    public static class SummaryResult {
        public int totalItems;
        public int[] maxCoordinate;

        public SummaryResult(int totalItems, int[] maxCoordinate) {
            this.totalItems = totalItems;
            this.maxCoordinate = maxCoordinate;
        }
    }

    public static SummaryResult warehouseSummary(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return new SummaryResult(0, new int[]{-1, -1});
        }

        int total = 0;
        int maxVal = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total += grid[i][j];
                if (grid[i][j] > maxVal) {
                    maxVal = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new SummaryResult(total, new int[]{maxRow, maxCol});
    }

    public static void main(String[] args) {
        int[][] grid = {
            {4, 9, 2},
            {7, 1, 6},
            {3, 12, 5}
        };

        SummaryResult res = warehouseSummary(grid);
        System.out.println("Total items = " + res.totalItems);
        System.out.println("Max Coordinate = (" + res.maxCoordinate[0] + ", " + res.maxCoordinate[1] + ")");
    }
}