package week_1.class_problems;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }
    public static boolean isPalindromeArrayReversal(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        String reversedText = new String(reversedArray);
        return text.equals(reversedText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check for palindrome: ");
        String input = scanner.nextLine().trim();
        String cleanedInput = input.toLowerCase();

        boolean iterativeResult = isPalindromeIterative(cleanedInput);
        boolean recursiveResult = isPalindromeRecursive(cleanedInput);
        boolean arrayReversalResult = isPalindromeArrayReversal(cleanedInput);

        String iterStr = iterativeResult ? "Palindrome" : "Not Palindrome";
        String recurStr = recursiveResult ? "Palindrome" : "Not Palindrome";
        String arrayStr = arrayReversalResult ? "Palindrome" : "Not Palindrome";

        System.out.printf("Iterative: %s | Recursive: %s | Array Reversal: %s%n",
                iterStr, recurStr, arrayStr);

        scanner.close();
    }
}