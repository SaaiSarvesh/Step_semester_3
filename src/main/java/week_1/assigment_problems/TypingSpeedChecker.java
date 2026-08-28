package week_1.assigment_problems;

import java.util.Scanner;

public class TypingSpeedChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int totalChars = original.length();

        if (totalChars != typed.length()) {
            System.out.println("Error: Both passages must be of equal length.");
            return;
        }

        int matchedCount = 0;
        int firstMismatchPosition = -1;
        char originalChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < totalChars; i++) {
            char orig = original.charAt(i);
            char typ = typed.charAt(i);

            if (orig == typ) {
                matchedCount++;
            } else if (firstMismatchPosition == -1) {
                firstMismatchPosition = i + 1;
                originalChar = orig;
                typedChar = typ;
            }
        }

        double accuracy = ((double) matchedCount / totalChars) * 100;

        if (firstMismatchPosition != -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matchedCount, totalChars, accuracy, firstMismatchPosition, originalChar, typedChar);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matchedCount, totalChars, accuracy);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original passage: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        checkTypingAccuracy(original, typed);

        scanner.close();
    }
}