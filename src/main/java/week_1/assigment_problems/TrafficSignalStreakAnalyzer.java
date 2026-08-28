package week_1.assigment_problems;

import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Log is empty.");
            return;
        }

        char maxChar = signalLog.charAt(0);
        int maxStreak = 1;

        char currentChar = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char c = signalLog.charAt(i);

            if (c == currentChar) {
                currentStreak++;
            } else {
                currentChar = c;
                currentStreak = 1;
            }
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
                maxChar = currentChar;
            }
        }

        System.out.printf("Longest Streak: '%c' repeated %d times%n", maxChar, maxStreak);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter signal log string (e.g., RRGGGYRR): ");
        String signalLog = scanner.nextLine().trim();

        findLongestStreak(signalLog);

        scanner.close();
    }
}