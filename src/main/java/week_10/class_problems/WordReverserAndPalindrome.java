package week_10.class_problems;

import java.util.Scanner;

public class WordReverserAndPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        
        if (word.equals(reversed)) {
            System.out.println(reversed + " - palindrome");
        } else {
            System.out.println(reversed + " - not a palindrome");
        }
        scanner.close();
    }
}