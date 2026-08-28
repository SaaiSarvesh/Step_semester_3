package week_2.class_problems;

import java.util.Scanner;

public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {
        if (phone == null) {
            return "Invalid phone number";
        }

        String trimmed = phone.trim();
        if (trimmed.length() != 10) {
            return "Invalid phone number";
        }
        for (int i = 0; i < trimmed.length(); i++) {
            if (!Character.isDigit(trimmed.charAt(i))) {
                return "Invalid phone number";
            }
        }
        String lastFour = trimmed.substring(6);

        StringBuilder masked = new StringBuilder();
        masked.append("XXXXXX");
        masked.insert(6, "-");
        masked.append(lastFour);

        return masked.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        String result = maskPhoneNumber(phone);
        System.out.println(result);

        scanner.close();
    }
}