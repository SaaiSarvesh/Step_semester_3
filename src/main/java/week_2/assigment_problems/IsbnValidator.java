package week_2.assigment_problems;

import java.util.Scanner;

public class IsbnValidator {

    public static String normalizeCode(String raw) {
        if (raw == null) {
            return "";
        }
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed;
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid Code: wrong length (must be exactly 13 characters)";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid Code: non-letter publisher code";
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid Code: non-digit body";
            }
        }
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);
        StringBuilder formatted = new StringBuilder();
        formatted.append("[").append(pubCode).append("] ")
                 .append("YEAR: ").append(year).append(" | ")
                 .append("CATALOG: ").append(catalog);

        return formatted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter raw ISBN code: ");
        String rawInput = scanner.nextLine();

        String normalizedCode = normalizeCode(rawInput);
        String result = validateAndFormat(normalizedCode);

        System.out.println(result);

        scanner.close();
    }
}