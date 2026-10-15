package week_10.assignment_problem_03;

import java.util.Arrays;

public class DutyRosterRotation {

    public static String[] rotateRoster(String[] names, long k) {
        if (names == null || names.length == 0) {
            return names;
        }

        int n = names.length;
        int effectiveK = (int) (k % n);
        
        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + effectiveK) % n;
            rotated[newIndex] = names[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        long k1 = 2;
        String[] result1 = rotateRoster(names, k1);
        System.out.println("Sample 1 Output: " + Arrays.toString(result1));
        long k2 = 7;
        String[] result2 = rotateRoster(names, k2);
        System.out.println("Sample 2 Output: " + Arrays.toString(result2));
    }
}