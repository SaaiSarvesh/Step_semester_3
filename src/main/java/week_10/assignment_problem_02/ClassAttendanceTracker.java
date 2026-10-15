package week_10.assignment_problem_02;

public class ClassAttendanceTracker {

    public static void attendanceSummary(int[] days) {
        int presentCount = 0;
        int currentStreak = 0;
        int maxStreak = 0;

        for (int day : days) {
            if (day == 1) {
                presentCount++;
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0; 
            }
        }

        System.out.println("Present: " + presentCount + ", Longest streak: " + maxStreak);
    }

    public static void main(String[] args) {
        int[] sample1 = {1, 1, 0, 1, 1, 1, 0, 1};
        int[] sample2 = {0, 0, 0};

        System.out.print("Sample 1 Output: ");
        attendanceSummary(sample1);

        System.out.print("Sample 2 Output: ");
        attendanceSummary(sample2);
    }
}