package week_10.assignment_problem_04;

public class ExamScoreBandCounter {
    private static int findLowerBound(int[] scores, int low) {
        int left = 0;
        int right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] >= low) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int findUpperBound(int[] scores, int high) {
        int left = 0;
        int right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] > high) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int countInBand(int[] scores, int low, int high) {
        int startIndex = findLowerBound(scores, low);
        int endIndex = findUpperBound(scores, high);
        return endIndex - startIndex;
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        
        int low1 = 42, high1 = 58;
        System.out.println("Sample 1 Output: " + countInBand(scores, low1, high1));
        int low2 = 90, high2 = 100;
        System.out.println("Sample 2 Output: " + countInBand(scores, low2, high2));
    }
}